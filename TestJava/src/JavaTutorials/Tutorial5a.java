package JavaTutorials;

import java.util.HashMap;
import java.util.Map;

/**
 * <h2>Tutorial5a Class</h2>
 * <p>
 * Process for Displaying Tutorial5a
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial5a {
    /**
     * <h2>main</h2>
     * <p>
     * main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();// Creating HashMap
        hashmap.put(1, "PYTHON");
        hashmap.put(2, "PHP");
        hashmap.put(3, "JAVA");
        hashmap.put(4, "Perl");
        hashmap.put(5, "C#");
        for (Map.Entry<Integer, String> mapEntry : hashmap.entrySet()) {
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }
    }
}
