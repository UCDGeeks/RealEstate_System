/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import java.util.Arrays;

/**
 *
 * @author Anton Perera
 */
public class JSONQueue {
  private int maxSize;

  private long[] queArray;
  private JSONObject jsonHouseQueue;

//  private int front;
//
//  private int rear;
//
//  private int nItems;

    private JSONObject obj=new JSONObject();
//    private JSONObject obj2;
  
//  public JSONQueue() {
////    maxSize = s;
////    queArray = new long[maxSize];
//    front = 0;
//    rear = -1;
//    nItems = 0;
//  }

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
//    if (rear == maxSize - 1) // deal with wraparound
//      rear = -1;
//    queArray[++rear] = j; // increment rear and insert
//    nItems++;   
    int[] valueArrInt2=valueArrInt;
    String[] vlueArrStr2=vlueArrStr;
    JSONParser parser=new JSONParser();
//    String json="{\"lotnumber\": 0,\"price\": 0,\"sqrft\": 0,\"bedrooms\": 0,\"fName\": \"as\",\"lName\": \"sd\"}";
    try{
        String sHouses=houses.toString();

//            Object housesObj = parser.parse(json);
//            JSONArray housesArray = (JSONArray)housesObj;

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

  //   take item from front of queue
//  public long remove() {
//    long temp = queArray[front++]; // get value and incr front
//    if (front == maxSize) // deal with wraparound
//      front = 0;
//    nItems--; // one less item
//    return temp;
//  }
//
//  public long peekFront() {
//    return queArray[front];
//  }
//
//  public boolean isEmpty() {
//    return (nItems == 0);
//  }
//
//  public boolean isFull() {
//    return (nItems == maxSize);
//  }
//
//  public int size() {
//    return nItems;
//  }

}
