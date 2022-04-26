package JavaTutorials;

/**
 * <h2>Tutorial3a Class</h2>
 * <p>
 * Process for Displaying Tutorial3a
 * </p>
 * 
 * @author khinthantsin
 */
public class Tutorial3a {
    /**
     * <h2>main</h2>
     * <p>
     * Main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = new int[] { 3, 4, 5, 7, 9 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        float average = sum / numbers.length;
        System.out.println("The average value of the array elements is : " + average);
    }
}
