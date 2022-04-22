package testPack;

import ojtJava.Pet;

/**
 * <h2>Cat Class</h2>
 * <p>
 * Process for Displaying Cat
 * </p>
 * 
 * @author khinthantsin
 */
public class Cat extends Pet {

    /**
     * <h2>main</h2>
     * <p>
     * Main method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        Cat petCat = new Cat();
        petCat.message();
        petCat.setBreed("Persian");
        petCat.setAge(1);
        System.out.println(petCat.getBreed() + " " + petCat.getAge());
    }
}
