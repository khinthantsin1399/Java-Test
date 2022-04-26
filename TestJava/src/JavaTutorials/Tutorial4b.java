package JavaTutorials;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <h2>Tutorial4b Class</h2>
 * <p>
 * Process for Displaying Tutorial4b
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial4b {
    /**
     * <h2>main</h2>
     * <p>
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.print("The Color Collection : " + list);
        Collections.swap(list, 0, 2);
        System.out.println("\nThe Color Collection after swapping : " + list);
    }
}
