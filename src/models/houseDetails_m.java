/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author thisaru
 */
public class houseDetails_m {
    
    private int lotNum,price,square_feet;
    private String name; 

    public void setLotNumber(int lotNum) {
        this.lotNum = lotNum;
    }

    public void setPrice(int price) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.price = price;
    }

    public void setName(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.name=name;
    }

    public void setSquareFeet(int square_feet) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.square_feet=square_feet;
    }
    
    
    public int getLotNum(){
        return lotNum;
    }
    
    
    public int getPrice(){
        return price;
    }
    
    
    public int getsquareFeet(){
        return square_feet;
    }
    
    
    public String getName(){
        return name;
    }
}
