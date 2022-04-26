package JavaTutorials;

import java.util.Scanner;

/**
 * <h2>Tutorial2a Class</h2>
 * <p>
 * Process for Displaying Tutorial2a
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial2a {
    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int inputNum = input.nextInt();
        input.close();
        if (inputNum > 0) {
            System.out.println("Number is positive.");
        } else if (inputNum < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is 0.");
        }
    }

}
