/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author Sajeeka Mayomi
 */
public class HouseFileNew {

    private String[] readArray;
    private String[] writeArray;

    public void read() {
        int flag = SortedList.find(Integer.parseInt(writeArray[2]));
        if (flag != -1) {
            try {
                FileReader inputFile = new FileReader(filePath);
                BufferedReader reader = new BufferedReader(inputFile);
                int i = 0;
                while ((readArray[i] = reader.readLine()) != null) {
                    System.out.println(readArray[i++]);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Cannot Reading the file Text.txt");
            }
        }
    }

    public void write() {

        try {
            File fileObject = new File(filePath);
            FileOutputStream fileOutputStream = new FileOutputStream(fileObject);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            Writer writerObject = new BufferedWriter(outputStreamWriter);

            for (int i = 0; i < writeArray.length && writeArray[i] != null; i++) {
                writerObject.write(writeArray[i] + "\n");
            }
            writerObject.close();
        } catch (IOException e) {
            System.out.println("Problem writing to the file " + filePath);
        }
    }
}
