/**
 * @author: Anton Perera, Sajeeka Mayomi
 */

package models;

import org.json.simple.parser.ParseException;
import connections.writer;
import connections.reader;

public class houseAdd_m {
    //Model class which stores the data received by the Controller sent from View.
    private String sHouses;
    
    public void setValuestoStore(int[] valueArrInt,String[] vlueArrStr) throws ParseException{
        //Instantiate read,write classes
        writer dataWriter=new writer();
        reader dataReader=new reader();
        dataWriter.save(this.insert(dataReader.get(),valueArrInt,vlueArrStr));       
    }    
    
    private void addHouse(String Houses,int[] valueArrInt2,String[] vlueArrStr2,int index){
        String newHouse;
        newHouse = Houses;
        newHouse+="lotNumber:"+String.valueOf(valueArrInt2[0])+",";
        newHouse+="price:"+String.valueOf(valueArrInt2[1])+",";
        newHouse+="sqrft:"+String.valueOf(valueArrInt2[2])+",";
        newHouse+="bedrooms:"+String.valueOf(valueArrInt2[3])+",";
        newHouse+="fName:"+vlueArrStr2[0]+",";
        newHouse+="lName:"+vlueArrStr2[1]+",";
        newHouse+="\n";
        
        this.sHouses=newHouse;
    }
  
    public String insert(String Houses,int[] valueArrInt,String[] vlueArrStr) {  
        int[] valueArrInt2=valueArrInt;
        String[] vlueArrStr2=vlueArrStr;

        int i=0;            
        this.addHouse(Houses,valueArrInt2, vlueArrStr2,i);            
        return this.sHouses;
    }
}
