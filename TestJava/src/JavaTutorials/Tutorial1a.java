package JavaTutorials;

import java.util.Scanner;

/**
 * <h2>Tutorial1a Class</h2>
 * <p>
 * Process for Displaying Tutorial1a
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial1a {
    /**
     * <h2>main</h2>
     * <p>
     * main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = input.nextInt();
        input.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
