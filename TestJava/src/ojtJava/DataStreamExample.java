package ojtJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <h2>DataStreamExample Class</h2>
 * <p>
 * Process for Displaying DataStreamExample
 * </p>
 * 
 * @author khinthantsin
 */
public class DataStreamExample {
    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        try {
            FileInputStream fin = new FileInputStream("testot.txt");
            // Reading characters from FileInputStream and write them
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();// close file connection
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }
    }
}
