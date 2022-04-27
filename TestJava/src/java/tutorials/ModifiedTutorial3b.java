package java.tutorials;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h2>ModifiedTutorial3b Class</h2>
 * <p>
 * Process for Displaying ModifiedTutorial3b
 * </p>
 * 
 * @author khinthantsin
 */
public class ModifiedTutorial3b {
    /**
     * <h2>main</h2>
     * <p>
     * main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        int i, j, element, count = 0;
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[] { 25, 14, 15, 56, 36 };
        int size = numbers.length;
        System.out.print("Enter the number to Remove: ");
        element = input.nextInt();
        for (i = 0; i < size; i++) {
            if (element == numbers[i]) {
                for (j = i; j < (size - 1); j++)
                    numbers[j] = numbers[j + 1];
                size--;
                i--;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("\nNumber not found!");
            System.out.println("\nThe array is: " + Arrays.toString(numbers));
        } else {
            System.out.println("\nThe modified array is: ");
            for (i = 0; i < size; i++)
                System.out.print(numbers[i] + " ");
        }
    }
}
