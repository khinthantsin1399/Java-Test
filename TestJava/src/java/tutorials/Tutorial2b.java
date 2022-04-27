package java.tutorials;

import java.util.Scanner;

/**
 * <h2>Tutorial2b Class</h2>
 * <p>
 * Process for Displaying Tutorial2b
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial2b {
    /**
     * <h2>main</h2>
     * <p>
     * Main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int firstNum = input.nextInt();
        System.out.print("Input the 2nd number: ");
        int secondNum = input.nextInt();
        System.out.print("Input the 3rd number: ");
        int thirdNum = input.nextInt();
        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.println("The greatest: " + firstNum);
        } else if (secondNum > thirdNum) {
            System.out.println("The greatest: " + secondNum);
        } else {
            System.out.println("The greatest: " + thirdNum);
        }
    }

}
