package ojt.test;

/**
 * <h2>ControlExample Class</h2>
 * <p>
 * Process for Displaying ControlExample
 * </p>
 * 
 * @author khinthantsin
 */
public class ControlExample {
    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if (x > y) {
            System.out.println("x is greater than y.");
        } else if (x < y) {
            System.out.println("x is less than y.");
        } else {
            System.out.println("x is equal to y.");
        }

        System.out.println("\nDo..While Loop");
        do {
            System.out.println(x);
            x++;
        } while (x <= 10);

        System.out.println("\nWhile Loop");
        while (y <= 15) {
            System.out.println(y);
            y++;
        }
    }
}