package JavaTutorials;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h2> Tutorial3b Class</h2>
 * <p>
 * Process for Displaying Tutorial3b
 * </p>
 * @author khinthantsin
 */
public class Tutorial3b {
    /**
     * <h2> main</h2>
     * <p>
     * Main Method
     * </p>
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = new int[] { 25, 14, 56, 15, 36 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to remove from " + Arrays.toString(numbers) + ": ");
        int removeNum = sc.nextInt();
        sc.close();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == removeNum) {
                for (int j = i; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
            }
        }
        System.out.println("Array after deletion :");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
