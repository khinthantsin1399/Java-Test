package ojtJava;

/**
 * <h2>Student Class</h2>
 * <p>
 * Process for Displaying Student
 * </p>
 * 
 * @author khinthantsin
 */
public class StudentInfo {
    /**
     * <h2>name</h2>
     * <p>
     * name
     * </p>
     */
    String name;
    /**
     * <h2>id</h2>
     * <p>
     * id
     * </p>
     */
    int id;

    /**
     * <h2>display</h2>
     * <p>
     * Method for displaying student information
     * </p>
     * 
     * @param name
     * @param id
     */
    public void display(String name, int id) {
        System.out.println(name + " " + id);
    }

    // Static Method
    /**
     * <h2>displayAddress</h2>
     * <p>
     * Method for displaying address
     * </p>
     * 
     * @param address
     */
    public static void displayAddress(String address) {
        System.out.println(address);
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
        StudentInfo student = new StudentInfo();// Object Creation
        student.display("khin", 3);
        Student.displayAddress("Yangon");
    }
}