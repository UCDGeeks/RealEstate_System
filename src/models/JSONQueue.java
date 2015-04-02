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


/**
 *
 * @author Anton
 */
public class JSONQueue {
  private int maxSize;

  private long[] queArray;
  private JSONObject jsonHouseQueue;

  private int front;

  private int rear;

  private int nItems;

    private JSONObject obj;
//    private JSONObject obj2;
  
  public JSONQueue() {
//    maxSize = s;
//    queArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  private void enqueue(JSONObject obj2){
    this.obj.put("lotNumber",obj2.get("lotNumber"));
    this.obj.put("price",obj2.get("price"));
    this.obj.put("sqrft",obj2.get("sqrft"));
    this.obj.put("bedrooms",obj2.get("bedrooms"));
    this.obj.put("fName",obj2.get("fName"));
    this.obj.put("lName",obj2.get("lName"));
  }
  
  private void enqueueLastNode(int[] valueArrInt,String[] vlueArrStr){
    this.obj.put("lotNumber",valueArrInt[0]);
    this.obj.put("price",valueArrInt[1]);
    this.obj.put("sqrft",valueArrInt[2]);
    this.obj.put("bedrooms",valueArrInt[3]);
    this.obj.put("fName",vlueArrStr[0]);
    this.obj.put("lName",vlueArrStr[1]);
  }
  
  //   put item at end of a queue
  public JSONObject insert(JSONObject houses,int[] valueArrInt,String[] vlueArrStr) {
//    if (rear == maxSize - 1) // deal with wraparound
//      rear = -1;
//    queArray[++rear] = j; // increment rear and insert
//    nItems++;   
    
        JSONParser parser=new JSONParser();
    int i;
    //      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
    String sHouses=houses.toString();
    try{
        Object housesObj = parser.parse(sHouses);
        JSONArray housesArray = (JSONArray)housesObj;
    //         System.out.println("The 2nd element of array");
        //System.out.println(housesArray.get(1));
        for(i=0;i<housesArray.size();i++){
            JSONObject obj2 = (JSONObject)housesArray.get(i);
            this.enqueue(obj2);
        }
        
        this.enqueueLastNode(valueArrInt, vlueArrStr);
        
        this.jsonHouseQueue=this.obj;
        return this.jsonHouseQueue;
        
    }catch (ParseException ex) {
        Logger.getLogger(JSONQueue.class.getName()).log(Level.SEVERE, null, ex);
        return null;
    }
    
  }
  
//  private JSONArray generateHousesJSONObj(JSONObject houses){
//
//  }

  //   take item from front of queue
  public long remove() {
    long temp = queArray[front++]; // get value and incr front
    if (front == maxSize) // deal with wraparound
      front = 0;
    nItems--; // one less item
    return temp;
  }

  public long peekFront() {
    return queArray[front];
  }

  public boolean isEmpty() {
    return (nItems == 0);
  }

  public boolean isFull() {
    return (nItems == maxSize);
  }

  public int size() {
    return nItems;
  }

//  public static void main(String[] args) {
//    Queue theQueue = new Queue(5); // queue holds 5 items
//
//    theQueue.insert(10);
//    theQueue.insert(20);
//    theQueue.insert(30);
//    theQueue.insert(40);
//
//    theQueue.remove(); 
//    theQueue.remove(); 
//    theQueue.remove();
//
//    theQueue.insert(50); 
//    theQueue.insert(60); //    (wraps around)
//    theQueue.insert(70);
//    theQueue.insert(80);
//
//    while (!theQueue.isEmpty()) {
//      long n = theQueue.remove(); // (40, 50, 60, 70, 80)
//      System.out.print(n);
//      System.out.print(" ");
//    }
//    System.out.println("");
//  }
}
