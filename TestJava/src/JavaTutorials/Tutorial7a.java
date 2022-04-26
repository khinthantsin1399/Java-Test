package JavaTutorials;

import java.util.Scanner;

/**
 * <h2>Tutorial7a Class</h2>
 * <p>
 * Process for Displaying Tutorial7a
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial7a {
    /**
     * <h2>main</h2>
     * <p>
     * Main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter number of Fibbonacci terms: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int num1 = 1;
        int num2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(num2);
            num2 = num1 + num2;
            num1 = num2 - num1;
            if (i <= n - 1) {
                System.out.print(",");
            }
        }
    }
}
