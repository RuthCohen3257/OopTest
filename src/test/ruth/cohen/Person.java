package test.ruth.cohen;

// Abstract class representing a person in the university
public abstract class Person {
    private String name;  // Name of the person
    private int age;  // Age of the person
    protected String address;  // Address is protected, allowing subclasses to access it

    // Constructor to initialize the attributes of the person
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter for the name of the person
    public String getName() {
        return name;
    }

    // Getter for the age of the person
    public int getAge() {
        return age;
    }

    // Getter for the address of the person
    public String getAddress() {
        return address;
    }

    // Abstract method to be implemented by subclasses to define the role of the person
    public abstract String getRole();
}

