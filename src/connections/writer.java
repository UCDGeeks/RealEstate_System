/**
 *
 * @author Anton Perera
 */

package connections;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class writer {
    public void save(String houses){
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
}
    

