package java.tutorials;

import java.util.Scanner;

/**
 * <h2>Tutorial1b Class</h2>
 * <p>
 * Process for Displaying Tutorial1b
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial1b {
    /**
     * <h2>main</h2>
     * <p>
     * Main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows for half pattern ");
        int n = input.nextInt();
        input.close();
        int alphabet = 65;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print((char) (alphabet + j));
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(" ");
            }
            for (int l = n - i; l >= 0; l--) {
                if (l != n) {
                    System.out.print((char) (alphabet + l));
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print((char) (alphabet + j));
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(" ");
            }
            for (int l = n - i; l >= 0; l--) {
                if (l != n) {
                    System.out.print((char) (alphabet + l));
                }
            }
            System.out.println();
        }
    }
}