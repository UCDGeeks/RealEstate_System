/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;

/**
 *
 * @author user
 */
public class ListHouse implements Listable {
    
private String lastName;
private String firstName;
private int lotNumber;
private int rPrice;
private int squareFeet;
private int bedRooms;

    public ListHouse(String lastName, String firstName, int lotNumber,int price, int squareFeet, int bedRooms )
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.lotNumber = lotNumber;
        this.rPrice = price;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }
    public  Listable Listable()
    {
        ListHouse result = new ListHouse(lastName, firstName, lotNumber, rPrice,squareFeet, bedRooms);
        return result;
    }
    public int compareTo(Listable otherListHouse)
    {
        ListHouse other = (ListHouse)otherListHouse;
        return (this.lotNumber - other.lotNumber);
    }
    public String getlastName()
    {
        return lastName;
    }
    public String getfirstName()
    {
        return firstName;
    }
    public int getlotNumber()
    {
        return lotNumber;
    }
    public int getrPrice()
    {
        return rPrice;
    }
    public int getsquareFeet()
    {
        return squareFeet;
    }
    public int getbedRooms()
    {
        return bedRooms;
    }

    /**
     *
     * @return
     */
    @Override
    public Listable copy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(int lotNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
