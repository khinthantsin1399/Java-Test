package JavaTutorials;

import java.util.HashMap;

/**
 * <h2>Tutorial5b Class</h2>
 * <p>
 * Process for Displaying Tutorial5b
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial5b {
    /**
     * <h2>main</h2>
     * <p>
     * main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        //First hashmap
        HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();// Creating HashMap
        hashmap1.put(1, "PYTHON");
        hashmap1.put(2, "PHP");
        hashmap1.put(3, "JAVA");
        //Second hashmap
        HashMap<Integer, String> hashmap2 = new HashMap<Integer, String>();// Creating HashMap
        hashmap2.put(4, "Perl");
        hashmap2.put(5, "C#");
        // Copying one HashMap to another HashMap
        hashmap1.putAll(hashmap2);
        System.out.println("Hashmap After Copying two hashmaps :" + hashmap1);
    }
}
