/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchhome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Nimaz
 */
public class SearchHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            ArrayList<String> list = new ArrayList<String>();
            BufferedReader br = new BufferedReader(new FileReader("searchHome.txt"));
            StringBuilder sb = new StringBuilder();
            String line = "";
            String lotNum = "2";
            String[] splited = null;
            String[] splited2 = null;
            String splited3[] = new String[6]; 
            while ((line = br.readLine()) != null) {
                
                if (line.startsWith("lotNumber:"+lotNum)) {
                    list.add(line);
                }
            splited = line.split(" ");
                System.out.println(splited);
            int size=splited.length;
                for(int i=0;i<size;i++){
                    splited2=splited[i].split(":");
                    //System.out.println(Arrays.toString(splited[i].split(":")));
                    splited3[i]=splited2[1];
                }
            }
            
            System.out.println(list.get(0));
            System.out.println(splited[1]);
            System.out.println(splited3[5]);
            for(int i2=0;i2<splited3.length;i2++){
                System.out.println(splited3[i2]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
}
