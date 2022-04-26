package JavaTutorials;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <h2> Tutorial3c Class</h2>
 * <p>
 * Process for Displaying Tutorial3c
 * </p>
 * @author khinthantsin
 */
public class Tutorial3c {
    /**
     * <h2> main</h2>
     * <p>
     * main method
     * </p>
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Python");
        list.add("JAVA");
        list.add("PHP");
        list.add("Perl");
        list.add("C#");
        //converting array list to string array
        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);       
        }
        System.out.println("Array : " + Arrays.toString(arr));
    }
}
