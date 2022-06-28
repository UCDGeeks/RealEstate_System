/**
 *
 * @author Srimal Priyanga
 */
package searchhome;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderExample {

    public static void main(String[] args) {

        BufferedReader br = null;
        //list to store all houses
        List<String> HouseList = new ArrayList<String>();
        //List to arry convertion
        String[] HouseArray = HouseList.toArray(new String[HouseList.size()]);
        int count = 0;
        //To store all info ounder one lot number
        String[][] dataArray = new String[10][6];
        String txt = null;

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("searchHome.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                HouseList.add(sCurrentLine);
                HouseArray = HouseList.toArray(new String[HouseList.size()]);
                txt = HouseArray[count];
                int index = 0;
                for (String retval : txt.split(" ")) {
                    dataArray[count][index] = retval;
                    index++;
                }
                String[] tokens = null;
                for (int i = 0; i < 6; i++) {
                    if (i == 5) {
                        tokens = dataArray[count][i].split(":");
                        tokens = tokens[1].split(",");
                        dataArray[count][i] = tokens[0];
                        break;
                    }
                    tokens = dataArray[count][i].split(":");
                    dataArray[count][i] = tokens[1];
                    //System.out.println(dataArray[count][i]);
                }
                count++;
            }

            //Bubble Sort Start
            Boolean swap = true;
            do {
                swap = false;
                for (int i = 0; i < HouseArray.length - 1; i++) {
                    int first = Integer.parseInt(dataArray[i][0]);
                    int second = Integer.parseInt(dataArray[i + 1][0]);
                    if (first > second) {
                        for (int j = 0; j < 6; j++) {
                            String temp = dataArray[i][j];
                            dataArray[i][j] = dataArray[i + 1][j];
                            dataArray[i + 1][j] = temp;
                        }
                        swap = true;
                    }
                }
            } while (swap);
            //Bubble Sort End

            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
            for (int i = 0; i < HouseArray.length; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.println(dataArray[i][j]);
                }
                System.out.println("===============================");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
