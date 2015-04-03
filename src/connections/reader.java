/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connections;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anton Perera
 */
public class reader {
    public String get(){
        try {
            String getHouses = new Scanner( new File("src/assets/data/records.txt") ).useDelimiter("\\A").next();
            return getHouses;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(reader.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
