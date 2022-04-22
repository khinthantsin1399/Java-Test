package testPack;
import ojtJava.StudentInfo;

public class PackageExample {

    public static void main(String[] args) {
        StudentInfo student = new StudentInfo();// Object Creation
        student.display("khinthantsin", 33);
        StudentInfo.displayAddress("Yangon");
    }

}
