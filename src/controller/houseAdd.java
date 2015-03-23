/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

/**
 *
 * @author Anton
 */
import views.houseAdd_v;
import models.houseAdd_m;
public class houseAdd {
//   private houseAdd_m model;
//   private houseAdd_v view;
public houseAdd_m model;
        public static void main(String[] args) {
            // TODO code application logic here
            
            houseAdd_v view = new houseAdd_v();
            view.viewHouseadd();
            
            
//            this.view.viewHouseadd();
        }
        
        public void setValuesHouseAdd(int[] valueArrInt,String[] vlueArrStr){
            houseAdd_m newModel = new houseAdd_m();
            newModel.setLotNumber(valueArrInt[0]);
            newModel.setPrice(valueArrInt[1]);
            newModel.setSqrft(valueArrInt[2]);
            newModel.setBedrooms(valueArrInt[3]);
            
            newModel.setFname(vlueArrStr[0]);
            newModel.setLname(vlueArrStr[1]);
            
            this.model=newModel;
            
            System.out.println("Lot Number: "+model.getFname());
            System.out.println("First Name: "+model.getFname());
            System.out.println("Last Name: "+model.getFname());
            System.out.println("Price: "+model.getFname());
            System.out.println("Square Feet: "+model.getFname());
            System.out.println("Number of Bedrooms: "+model.getFname());
            
        }
}
