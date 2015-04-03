/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connections;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;

/**
 *
 * @author Anton Perera
 */
public class writer {
//    public static void main(String[] args){
//        write();
//    }
    
//    public static void write(String houses){
    public void save(String houses){
//        houses="1";
        FileWriter file = null;
        try {
            file = new FileWriter("src/assets/data/records.txt");
            file.write(houses);
            file.flush();
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(writer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(writer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}

//    private static void write() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void save(String get, String insert) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    

    }
