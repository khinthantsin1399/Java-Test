package java.tutorials;

import java.util.Scanner;

/**
 * <h2>Tutorial2c Class</h2>
 * <p>
 * Process for Displaying Tutorial2c
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial2c {
    /**
     * <h2>main</h2>
     * <p>
     * main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year:");
        int year = input.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
