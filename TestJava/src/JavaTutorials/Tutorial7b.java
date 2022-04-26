package JavaTutorials;

import java.util.Scanner;

/**
 * <h2>Tutorial7b Class</h2>
 * <p>
 * Process for Displaying Tutorial7b
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial7b {
    /**
     * <h2>main</h2>
     * <p>
     * Main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        String original;
        String reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string or number:");
        original = in.nextLine();
        in.close();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        if (original.equals(reverse))
            System.out.println("This String or number is a palindrome.");
        else
            System.out.println("This String or number isn't a palindrome.");
    }
}
