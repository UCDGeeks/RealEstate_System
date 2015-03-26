/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


/**
 *
 * @author thisaru
 */

import views.houseDetails_v;
//import models.houseDetails_m;

public class houseDetails {
    
    public static void main(String[] args){
        //using object, call view,
        
        houseDetails_v view_houseDetails=new houseDetails_v();
        view_houseDetails.viewHouseDetails();
    }
    
}
