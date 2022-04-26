package ojtJava;

/**
 * <h2>Pet Class</h2>
 * <p>
 * Process for Displaying Pet
 * </p>
 * 
 * @author khinthantsin
 */

public class Pet {

    /**
     * <h2>breed</h2>
     * <p>
     * breed
     * </p>
     */
    // private field
    private String breed;
    /**
     * <h2>age</h2>
     * <p>
     * age
     * </p>
     */
    // private field
    private int age;

    /**
     * <h2>getBreed</h2>
     * <p>
     * Getter method for breed
     * </p>
     * 
     * @return
     */
    public String getBreed() {
        return (breed);
    }

    /**
     * <h2>setBreed</h2>
     * <p>
     * setter method for breed
     * </p>
     * 
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * <h2>getAge</h2>
     * <p>
     * Getter method for age
     * </p>
     * 
     * @return
     */
    public int getAge() {
        return (age);
    }

    /**
     * <h2>setAge</h2>
     * <p>
     * Setter method for age
     * </p>
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * <h2>message</h2>
     * <p>
     * protected method
     * </p>
     */
    protected void message() {
        System.out.println("Hello Pet...");
    }

    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        Pet petDog = new Pet();
        petDog.message();
        petDog.setBreed("Alaskan");
        petDog.setAge(3);
        System.out.println(petDog.getBreed() + " " + petDog.getAge());
    }

}
