package test.ruth.cohen;

// Class representing a professor, inheriting from the Person class
public class Professor extends Person {
    private String department;  // Department where the professor teaches

    // Constructor to initialize the professor attributes
    public Professor(String name, int age, String address, String department) {
        super(name, age, address);  // Call to the parent class constructor
        this.department = department;
    }

    // Implementation of the abstract method from Person, returns "Professor"
    @Override
    public String getRole() {
        return "Professor";
    }

    // Method representing the teaching activity of the professor
    public String teach() {
        return getName() + " is teaching in the " + department + " department.";  // Return a string describing the professor's activity
    }
}

