package models;

import connections.reader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Thisaru Sanduranga, Srimal Priyanga
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
    
    public void setValuestoStore(int[] valueArrInt,String[] vlueArrStr) throws ParseException{
        //Instantiate read,write classes
        reader dataReader=new reader();
        //this.getHousesbyLotNumber(dataReader.get());       
    }
    
    public String getHousesbyLotNumber(int lotNumber) {  
        reader dataReader=new reader();
                  
        String[] lines = dataReader.get().split("\\n");
        int size=lines.length;
        //System.out.println(""+dataReader.get());
        
        for(int i=0;i<size;i++){
            System.out.println(""+i+" "+lines[i]);
//            String[] values = lines[i].split(":\\s");
//            System.out.println(""+i+" "+Arrays.toString(values));
            
            String str = lines[i];
            Pattern pattern = Pattern.compile(",(.*?)\\s");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        }
        
        return null;
//        return sHouses;
    }
}
