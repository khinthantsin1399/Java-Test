package ojtJava;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

/**
 * <h2>ByteArrayOutput1 Class</h2>
 * <p>
 * Process for Displaying ByteArrayOutput1
 * </p>
 * 
 * @author khinthantsin
 */
public class ByteArrayOutput1 {

    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        try {
            FileOutputStream fout1 = new FileOutputStream("f1.txt");
            FileOutputStream fout2 = new FileOutputStream("f2.txt");

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);
            // write common data into f1.txt and f2.txt.
            bout.writeTo(fout1);
            bout.writeTo(fout2);

            bout.flush();

            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
