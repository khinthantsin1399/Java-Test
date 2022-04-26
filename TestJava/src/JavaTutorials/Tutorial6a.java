package JavaTutorials;

import java.io.File;
import java.util.Date;

/**
 * <h2>Tutorial6a Class</h2>
 * <p>
 * Process for Displaying Tutorial6a
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial6a {
    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("testout.txt");
        Date date = new Date(file.lastModified());
        System.out.println("Last modified time : " + date);
    }
}
