/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author user
 */
public class HouseFile {
    private static BufferedReader inFile;
    private static PrintWriter outFile;
    private static boolean inFileOpen = false;
    private static boolean outFileOpen = false;
    private static String inString ="";
    
    public static void reset() throws IOException
    {
        if (inFileOpen) inFile.close();
        if (outFileOpen) outFile.close();
        inFile = new BufferedReader(new FileReader("houses.txt"));
        inFileOpen = true;
        inString = inFile.readLine();
    }
    public static void rewrite() throws IOException
    {
        if (inFileOpen) inFile.close();
        if (outFileOpen) outFile.close();
        outFile = new PrintWriter(new FileWriter("houses.txt"));
        outFileOpen = true;
    }
    public static boolean moreHouses()
    {
        return !(!inFileOpen || (inString == null));
    }
    public static ListHouse getNextHouse() throws IOException
    {
        String lastName = "xxxxx";
        String firstName = "xxxxx";
        int lotNumber = 0;
        int rPrice = 0;
        int squareFeet = 0;
        int bedRooms =0;
        lastName = inString;
        firstName = inFile.readLine();
        lotNumber = Integer.parseInt(inFile.readLine());
        rPrice = Integer.parseInt(inFile.readLine());
        squareFeet = Integer.parseInt(inFile.readLine());
        bedRooms = Integer.parseInt(inFile.readLine());
        inString = inFile.readLine();
        ListHouse house = new ListHouse(lastName, firstName, lotNumber, rPrice,squareFeet, bedRooms);
        return house;
    }
    //public static void putToFile(ListHouse house) throws IOException
    //{
      //  outFile.println(house.lastName());
       // outFile.println(house.firstName());
       // outFile.println(house.lotNumber());
       // outFile.println(house.squareFeet());
       // outFile.println(house.bedRooms());
       // outFile.println(house.rPrice());
        
        
   // }
    public static void close() throws IOException
    {
        if (inFileOpen) inFile.close();
        if (outFileOpen) outFile.close();
        inFileOpen = false;
        outFileOpen = false;
    }
    
    }
