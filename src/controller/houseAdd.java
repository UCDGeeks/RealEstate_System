/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

/**
 *
 * @author Anton Perera
 */
import views.houseAdd_v;
import models.houseAdd_m;
public class houseAdd {
    public houseAdd_m model;
    
    public static void main(String[] args) {
        //Display the View
        houseAdd_v view = new houseAdd_v();
        view.viewHouseadd();
    }

    public boolean setValuesHouseAdd(int[] valueArrInt,String[] vlueArrStr){
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
        System.out.println("Lot Number: "+model.getFname());
        System.out.println("First Name: "+model.getFname());
        System.out.println("Last Name: "+model.getFname());
        System.out.println("Price: "+model.getFname());
        System.out.println("Square Feet: "+model.getFname());
        System.out.println("Number of Bedrooms: "+model.getFname());
        
        return true;

    }
}
