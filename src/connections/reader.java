/**
* @author Srimal Priyanga
 */

package connections;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
