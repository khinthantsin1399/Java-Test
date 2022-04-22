package ojtJava;

//parent abstract class
abstract class Employee{
    abstract void getSalary();//abstract method
}

//derived class from Employee class 
class Employee1 extends Employee {
   
   /**
 * <h2> getSalary</h2>
 * <p>
 * overridden method from parent abstract method
 * </p>
 */
void getSalary() {
        int bonus=10000;
        int salary=100000;
        int sum=bonus+salary;
        System.out.println("Salary for employee 1 is :" + sum);
    }
}

//derived class from Employee class 
class Employee2 extends Employee {
    
    /**
     * <h2> getSalary</h2>
     * <p>
     * overridden method from parent abstract method
     * </p>
     */
    void getSalary() {
         int bonus=20000;
         int salary=150000;
         int sum=bonus+salary;
         System.out.println("Salary for employee 2 is :" + sum);
     }
 }
public class EmployeeTest {

    public static void main(String[] args) {
        Employee1 employee1= new Employee1();
        employee1.getSalary();
        Employee2 employee2= new Employee2();
        employee2.getSalary();

    }

}
