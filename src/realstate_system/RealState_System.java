/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package realstate_system;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import views.main;

/**
 *
 * @author Kalana Chandrasiri
 */



public class RealState_System {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
       
       //main myFrame = new main ();
       
        SwingUtilities.invokeLater(new Runnable() {
                       @Override
			public void run() {
				main main = new main();
				//main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				main.setVisible(true);
			}
		});
    }
    
}
