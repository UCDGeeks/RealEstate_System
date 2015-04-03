package models;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import java.util.Arrays;
import connections.json_reader;

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
    
    public void retriveData(){
        json_reader getdata=new json_reader();
        getdata.get();
        
        
        
    }
}
