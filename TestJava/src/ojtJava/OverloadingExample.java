package ojtJava;

/**
 * <h2>OverloadingExample Class</h2>
 * <p>
 * Process for Displaying OverloadingExample
 * </p>
 * 
 * @author khinthantsin
 */
public class OverloadingExample {
    /**
     * <h2>calculate</h2>
     * <p>
     * method to multiply two numbers
     * </p>
     * 
     * @param num1
     * @param num2
     * @return
     */
    static int calculate(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * <h2>calculate</h2>
     * <p>
     * Overloading method to multiply three numbers
     * </p>
     * 
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    static int calculate(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    /**
     * <h2>main</h2>
     * <p>
     * Main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(OverloadingExample.calculate(5, 5));
        System.out.println(OverloadingExample.calculate(5, 3, 2));

    }

}
