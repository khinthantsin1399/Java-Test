package ojtJava;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <h2>FileOutputStreamExample Class</h2>
 * <p>
 * Process for Displaying FileOutputStreamExample
 * </p>
 * 
 * @author khinthantsin
 */
public class FileOutputStreamExample {
    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * 
     * @param args
     */
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("testout.txt");
            String s = "Welcome to JAVA.";
            byte b[] = s.getBytes();// converting string into byte array
            fout.write(b);//write to file
            fout.close();//close file connection
            System.out.println("success...");
        } catch (IOException i) {
            i.printStackTrace();
            
        }
    }
}