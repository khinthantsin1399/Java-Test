package JavaTutorials;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * <h2>Tutorial6c Class</h2>
 * <p>
 * Process for Displaying Tutorial6c
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial6c {
    /**
     * <h2>main</h2>
     * <p>
     * main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        try {
            String line = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("testout.txt"));
            int i = 0;
            // print first 3 lines
            while (((line = bufferedReader.readLine()) != null) && i < 3) {
                System.out.println(line);
                i++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
