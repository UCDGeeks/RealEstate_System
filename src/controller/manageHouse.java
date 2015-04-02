/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

/**
 *
 * @author Anton Perera, Thisaru Saduranga
 */
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
        newModel.setLotNumber(valueArrInt[0]);
        newModel.setPrice(valueArrInt[1]);
        newModel.setSqrft(valueArrInt[2]);
        newModel.setBedrooms(valueArrInt[3]);

        newModel.setFname(vlueArrStr[0]);
        newModel.setLname(vlueArrStr[1]);
        
        //Assign the newModel in to the class Property model.
        this.model=newModel;

        newModel.setValuestoStore(valueArrInt,vlueArrStr);
        
        //Display the saved data on Console
//        System.out.println("Lot Number: "+model.getFname());
//        System.out.println("First Name: "+model.getFname());
//        System.out.println("Last Name: "+model.getFname());
//        System.out.println("Price: "+model.getFname());
//        System.out.println("Square Feet: "+model.getFname());
//        System.out.println("Number of Bedrooms: "+model.getFname());
        
        return true;

    }
    
    public void houseDetails() {
        //Display the House Add View
        houseDetails_v houseDetailsView = new houseDetails_v();
        houseDetailsView.viewHouseDetails();
    }
}
