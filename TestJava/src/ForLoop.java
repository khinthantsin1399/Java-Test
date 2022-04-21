
/**
 * <h2>ForLoop Class</h2>
 * <p>
 * Process for Displaying ForLoop
 * </p>
 * 
 * @author khinthantsin
 */
public class ForLoop {

    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 1; x <= 20; x++) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);
    }

}
