package ojtJava;

//parent interface class
interface EmployeeSalary {
    abstract void getSalary(int salary);
}

//parent interface class
interface EmployeeProfile {
    abstract void getProfile(String name, int age);
}

//Multiple inheritance by interface
class Programmer implements EmployeeSalary, EmployeeProfile {

    /**
     * <h2>getSalary</h2>
     * <p>
     * method for displaying salary
     * </p>
     */
    public void getSalary(int salary) {

        System.out.println("Salary is : " + salary);
    }

    /**
     * <h2>getProfile</h2>
     * <p>
     * method for displaying profile
     * </p>
     */
    public void getProfile(String name, int age) {
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }
}

/**
 * <h2>EmployeeInfo Class</h2>
 * <p>
 * Process for Displaying EmployeeInfo
 * </p>
 * 
 * @author khinthantsin
 */
public class EmployeeInfo {

    /**
     * <h2>main</h2>
     * <p>
     * .Main Method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        Programmer pro = new Programmer();
        pro.getProfile("ABC", 22);
        pro.getSalary(100000);

    }

}
