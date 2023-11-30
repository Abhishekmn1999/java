// Abstract class "Animal"
abstract class Animal {
    // Abstract method 'walk' (no implementation)
    abstract void walk();

    // Concrete method 'breathe' with a default implementation
    void breathe() {
        System.out.println("This animal breathes air");
    }

    // Constructor of the abstract class
    Animal() {
        System.out.println("You are about to create an Animal.");
    }
}

// Class 'Horse' extending the 'Animal' class
class Horse extends Animal {
    // Constructor of the 'Horse' class
    Horse() {
        System.out.println("Wow, you have created a Horse!");
    }

    // Implementation of the 'walk' method defined in the 'Animal' class
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

// Main class
public class Main {
    public static void main(String args[]) {
        // Create an object of the 'Horse' class
        Horse horse = new Horse();

        // Invoke the 'walk' method of the 'Horse' class
        horse.walk();

        // Invoke the 'breathe' method inherited from the 'Animal' class
        horse.breathe();
    }
}
