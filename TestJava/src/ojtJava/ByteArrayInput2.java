package ojtJava;

import java.io.ByteArrayInputStream;

/**
 * <h2>ByteArrayInput2 Class</h2>
 * <p>
 * Process for Displaying ByteArrayInput2
 * </p>
 * 
 * @author khinthantsin
 */
public class ByteArrayInput2 {
    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        byte[] buf = { 35, 36, 37, 38 };
        // Create the new byte array input stream
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while ((k = byt.read()) != -1) {
            // Conversion of a byte into character
            char ch = (char) k;
            System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
        }
    }
}
