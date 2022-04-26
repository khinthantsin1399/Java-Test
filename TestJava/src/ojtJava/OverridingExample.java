package ojtJava;

//parent Adder class
class Adder {
    /**
     * <h2>calculate</h2>
     * <p>
     * Parent method
     * </p>
     * 
     * @param num1
     * @param num2
     */
    void calculate(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum : " + sum);
    }
}

//derived Multiplication class from parent Adder class
class Multiplication extends Adder {
    /**
     * <h2>calculate</h2>
     * <p>
     * Overriding method
     * </p>
     * *
     * 
     * @param num1
     * @param num2
     */
    @Override
    void calculate(int num1, int num2) {
        System.out.println("Product : " + num1 * num2);
        super.calculate(5, 3);
    }
}

/**
 * <h2>OverridingExample Class</h2>
 * <p>
 * Process for Displaying OverridingExample
 * </p>
 * 
 * @author khinthantsin
 */
public class OverridingExample {

    /**
     * <h2>main</h2>
     * <p>
     * Main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        Multiplication multiply = new Multiplication();
        multiply.calculate(4, 5);
    }
}
