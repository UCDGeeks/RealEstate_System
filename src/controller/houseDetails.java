package controller;


/**
 *
 * @author thisaru
 */


import models.houseDetails_m;
import views.houseDetails_v;
//import models.houseDetails_m;

public class houseDetails {
    
    public houseDetails_m model;
    
    public static void main(String[] args){
        //using object, call view,
        
        houseDetails_v view_houseDetails=new houseDetails_v();
        view_houseDetails.viewHouseDetails();
    }

    public void setHouseDetailsInt(int value, String type) {
        
        //Instantiate the Model and save the received data from View
        houseDetails_m newModel = new houseDetails_m();
        
         //Assign the newModel in to the class Property model.
        this.model=newModel;
        
        if(type == "lot_num"){
            newModel.setLotNumber(value);
            
            //Display the saved data on Console
            System.out.println("Lot Number: "+model.getLotNum());
            
        }else if(type=="price"){
            newModel.setPrice(value);
            
            //Display the saved data on Console
            System.out.println("price is: "+model.getPrice());
            
        }else if(type=="square_feet"){
            newModel.setSquareFeet(value);
            
            //Display the saved data on Console
            System.out.println("square feet is: "+model.getsquareFeet());
        }
        
    }
    
    
    
    
    public void setHouseDetailsString(String value) {
        
        //Instantiate the Model and save the received data from View
        houseDetails_m newModel = new houseDetails_m();
        
        //Assign the newModel in to the class Property model.
        this.model=newModel;
        
        newModel.setName(value); 
        
         //Display the saved data on Console
         System.out.println("By Name: "+model.getName());
    }
    
    
}
