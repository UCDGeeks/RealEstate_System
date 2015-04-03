/**
 * @author: Anton Perera, Thisaru Saduranga
 */

package controller;
import views.houseAdd_v;
import models.houseAdd_m;

import models.houseDetails_m;
import views.houseDetails_v;

import views.home;
import org.json.simple.parser.ParseException;

public class manageHouse {
    
//************** House Add Section Functionality ************* 
    public houseAdd_m model;
        
    public void viewHome() {
        //Display the House Manage Home View
        home Homeview = new home();
        Homeview.viewHome();
    }
    
    public void addHouse() {
        //Display the House Add View
        houseAdd_v addHouseView = new houseAdd_v();
        addHouseView.viewHouseadd();
    }

    public boolean setValuesHouseAdd(int[] valueArrInt,String[] vlueArrStr) throws ParseException{
        //Instantiate the Model and save the received data from View
        houseAdd_m newModel = new houseAdd_m(); 
        newModel.setValuestoStore(valueArrInt,vlueArrStr);        
        return true;
    }
    
    public void houseDetails() {
        //Display the House Add View
        houseDetails_v houseDetailsView = new houseDetails_v();
        houseDetailsView.viewHouseDetails();
    }
}
