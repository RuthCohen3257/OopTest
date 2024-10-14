package test.ruth.cohen;

// Class representing a student, inheriting from the Person class
public class Student extends Person {
    private String studentId;  // Unique student ID

    // Constructor to initialize the student attributes
    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);  // Call to the parent class constructor
        this.studentId = studentId;
    }

    // Implementation of the abstract method from Person, returns "Student"
    @Override
    public String getRole() {
        return "Student";
    }

    // Method representing the study activity of the student
    public String study() {
        return getName() + " is studying.";  // Return a string describing the student's activity
    }
}

