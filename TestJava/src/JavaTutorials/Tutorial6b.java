package JavaTutorials;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <h2>Tutorial6b Class</h2>
 * <p>
 * Process for Displaying Tutorial6b
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial6b {
    /**
     * <h2>main</h2>
     * <p>
     * Main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("testout.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println("Hello!");
            System.out.println("Success...");
            pw.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
