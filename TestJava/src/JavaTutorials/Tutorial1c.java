package JavaTutorials;

import java.util.Scanner;

/**
 * <h2>Tutorial1c Class</h2>
 * <p>
 * Process for Displaying Tutorial1c
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial1c {
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
        int alphabet = 65;
        int temp = 1;
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (alphabet + (temp * j) - 1) + " ");
            }
            System.out.println();
            temp++;
        }
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n / 2 + 1 - i; j++) {
                System.out.print((char) (alphabet + (temp * j) - 1) + " ");
            }
            System.out.println();
            temp++;
        }
    }
}