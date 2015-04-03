/**
 * @author: Anton Perera
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
import connections.writer;
import connections.reader;

public class houseAdd_m {
    //Model class which stores the data received by the Controller sent from View.
    
    private int lotNumber,price,sqrft,bedrooms;
    private String fname,lname;
    
//    private JSONArray obj = new JSONArray();
    private JSONObject obj = new JSONObject();
    private JSONArray objArr = new JSONArray();
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
        System.out.println("newHouse");
        System.out.println(""+sHouses);
    }
  
    public String insert(String Houses,int[] valueArrInt,String[] vlueArrStr) {  
        int[] valueArrInt2=valueArrInt;
        String[] vlueArrStr2=vlueArrStr;

        int i=0;            
        this.addHouse(Houses,valueArrInt2, vlueArrStr2,i);            
        return this.sHouses;
    }
    
    
    private void enqueue(JSONObject obj2,int index){
        
        System.out.println("obj2:"+obj2);
        System.out.println("obj2 "+index+": "+obj2.get(""+index+""));
//        System.out.println("obj2 0:"+index+""+obj2.getJSONObject("result").getJSONObject("map"));
        
        JSONParser parser=new JSONParser();
        String House=obj2.toString();
        Object housesObj;
        try {
            housesObj = parser.parse(House);
            JSONArray housesArray = new JSONArray();
            housesArray.add(housesObj);
            //System.out.println(housesArray.get(0));;
//            JSONObject obj2 = (JSONObject)housesArray.get(i);

            JSONObject objToRecord =(JSONObject)housesArray.get(index);
            System.out.println("objToRecord:"+objToRecord);

            JSONObject record=new JSONObject();
            record.put("lotNumber",objToRecord.get("lotNumber"));
            record.put("price",objToRecord.get("price"));
            record.put("sqrft",objToRecord.get("sqrft"));
            record.put("bedrooms",objToRecord.get("bedrooms"));
            record.put("fName",objToRecord.get("fName"));
            record.put("lName",objToRecord.get("lName"));

            this.objArr.add(record);
    //        this.obj.put(index,record);
            System.out.println("enqueue:"+index+""+this.objArr);
        } catch (ParseException ex) {
            Logger.getLogger(houseAdd_m.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  
//    private void enqueueLastNode(String Houses,int[] valueArrInt2,String[] vlueArrStr2,int index){
    
//    public String insert(String houses,int[] valueArrInt,String[] vlueArrStr) {  
    
//    public JSONArray insert(String houses,int[] valueArrInt,String[] vlueArrStr) {  
//        int[] valueArrInt2=valueArrInt;
//        String[] vlueArrStr2=vlueArrStr;
//        JSONParser parser=new JSONParser();
//
//        try{
//            String sHouses=houses.toString();
//
//            Object housesObj  = parser.parse(sHouses);
//            JSONArray housesArray = new JSONArray();
//            housesArray.add(housesObj);
//            //System.out.println(housesArray.get(0));
//            int i=0;
////            for(i=0;i<housesArray.size();i++){
////                System.out.println("Array size: "+housesArray.size());
////                JSONObject obj2 = (JSONObject)housesArray.get(i);
////                System.out.println("Array: "+housesArray.get(i));
////                
////                this.enqueue(obj2,i);
////            }
//            
//            this.enqueueLastNode(valueArrInt2, vlueArrStr2,i);
//            System.out.println("print objArr"+this.obj);
//            
//            return this.obj;   
//            
////            JSONObject jsonObject = new JSONObject();
////            JSONArray array = new JSONArray();
////            for(i=0;i<=housesArray.size();i++){
////                JSONObject obj = new JSONObject();
////                obj.put("engine", "mkyong.com");
////                obj.put("browser", i);
////                obj.put("platform", i);
//
//                //if you are using JSON.simple do this
////                array.add(obj);
////            }
////            jsonObject.put("MyArray" , array);
////
////            System.out.print(jsonObject);
//
//
//        }catch(NullPointerException e){ //If no data records received from JSON files.
//            try{
//                this.enqueueLastNode(valueArrInt, vlueArrStr,0);
//                System.out.println(this.obj);
//            }
//            catch(NullPointerException e2){
//                System.out.println(this.obj);
//            }
//            return this.obj;   
//
//        }catch (ParseException ex) {
//            Logger.getLogger(houseAdd_m.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
    
    
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
