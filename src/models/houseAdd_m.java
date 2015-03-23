/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

/**
 *
 * @author Anton
 */
public class houseAdd_m {
    private int lotNumber,price,sqrft,bedrooms;
    private String fname,lname;

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSqrft(int sqrft) {
        this.sqrft = sqrft;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public int getPrice() {
        return price;
    }

    public int getSqrft() {
        return sqrft;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    
    
    
}
