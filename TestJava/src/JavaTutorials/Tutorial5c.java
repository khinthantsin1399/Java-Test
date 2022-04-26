package JavaTutorials;

import java.util.HashMap;
import java.util.Scanner;

/**
 * <h2>Tutorial5c Class</h2>
 * <p>
 * Process for Displaying Tutorial5c
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial5c {
    /**
     * <h2>main</h2>
     * <p>
     * main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();// Creating HashMap
        hashmap.put("PYTHON", 1);
        hashmap.put("PHP", 2);
        hashmap.put("JAVA", 3);
        hashmap.put("Perl", 4);
        hashmap.put("C#", 5);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter:");
        String key = input.next();
        input.close();
        // test key exits or not
        if (hashmap.containsKey(key)) {
            System.out.println("Hashmap contains " + hashmap.get(key) + "-" + key);
        } else {
            System.out.println("Hashmap does not contain the key you entered!");
        }
    }

}
