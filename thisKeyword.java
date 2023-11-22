public class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        // Use 'this' to refer to instance variables
        this.name = name;
        this.age = age;
    }

    // Method to print information about the person
    public void displayInfo() {
        // Use 'this' to refer to instance variables within a method
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        // Create an object of the class
        Person person1 = new Person("John", 25);

        // Call the displayInfo method on the object
        person1.displayInfo();
    }
}
