/**
 * @author: Anton Perera, Sajeeka Mayomi
 */

package models;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import java.util.Arrays;
import connections.json_reader;
import connections.json_writer;

public class houseAdd_m {
    //Model class which stores the data received by the Controller sent from View.
    
    private int lotNumber,price,sqrft,bedrooms;
    private String fname,lname;
    
    private JSONObject obj = new JSONObject();

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

    public void setValuestoStore(int[] valueArrInt,String[] vlueArrStr) throws ParseException{
        //Instantiate JSON read,write classes
        json_writer savedata=new json_writer();
        json_reader getdata=new json_reader();
        
        savedata.save(this.insert(null,valueArrInt,vlueArrStr));
        
        //Correct code using the get data from the file and then save the added record with it.
        //savedata.save(this.insert(getdata.get(),valueArrInt,vlueArrStr)); 
        
        //Temp code. Can be useful. Will be removed in finalization.
//        JSONParser parser = new JSONParser();
//        JSONObject json = (JSONObject) parser.parse("{\"lotnumber\": 0,\"price\": 0,\"sqrft\": 0,\"bedrooms\": 0,\"fName\": \"as\",\"lName\": \"sd\"}");
//        theQueue.insert(json,valueArrInt,vlueArrStr);        
    }
    
    private void enqueue(JSONObject obj2){
        this.obj.put("lotNumber",obj2.get("lotNumber"));
        this.obj.put("price",obj2.get("price"));
        this.obj.put("sqrft",obj2.get("sqrft"));
        this.obj.put("bedrooms",obj2.get("bedrooms"));
        this.obj.put("fName",obj2.get("fName"));
        this.obj.put("lName",obj2.get("lName"));
    }
  
    private void enqueueLastNode(int[] valueArrInt2,String[] vlueArrStr2){
        this.obj.put("lotNumber",vlueArrStr2[0]);
        this.obj.put("price",valueArrInt2[1]);
        this.obj.put("sqrft",valueArrInt2[2]);
        this.obj.put("bedrooms",valueArrInt2[3]);
        this.obj.put("fName",vlueArrStr2[0]);
        this.obj.put("lName",vlueArrStr2[1]);
    }
  
    public JSONObject insert(JSONObject houses,int[] valueArrInt,String[] vlueArrStr) {  
        int[] valueArrInt2=valueArrInt;
        String[] vlueArrStr2=vlueArrStr;
        JSONParser parser=new JSONParser();

        try{
            String sHouses=houses.toString();

            Object housesObj  = parser.parse(sHouses);
            JSONArray housesArray = new JSONArray();
            housesArray.add(housesObj);
            System.out.println(housesArray.get(0));

            for(int i=0;i<housesArray.size();i++){
                JSONObject obj2 = (JSONObject)housesArray.get(i);
                this.enqueue(obj2);
            }

            this.enqueueLastNode(valueArrInt2, vlueArrStr2);
            System.out.println(""+this.obj);
            return this.obj;   

        }catch(NullPointerException e){ //If no data records received from JSON files.
            try{
                this.enqueueLastNode(valueArrInt, vlueArrStr);
                System.out.println(this.obj);
            }
            catch(NullPointerException e2){
                System.out.println(this.obj);
            }
            return this.obj;   

        }catch (ParseException ex) {
            Logger.getLogger(JSONQueue.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
