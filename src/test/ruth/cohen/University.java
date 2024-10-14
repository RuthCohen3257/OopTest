package test.ruth.cohen;

import java.util.List;

// Main class representing the university system
public class University {
    public static void main(String[] args) {
        // Create instances of students and professors
        Student student1 = new Student("Alice", 20, "123 Street", "S123");
        Student student2 = new Student("Bob", 21, "456 Avenue", "S456");
        Professor professor1 = new Professor("Dr. Smith", 45, "789 Boulevard", "Computer Science");

        // Create instances of undergraduate and graduate courses
        UndergraduateCourse course1 = new UndergraduateCourse("Intro to Programming", "CS101");
        GraduateCourse course2 = new GraduateCourse("Advanced Algorithms", "CS301", "Algorithm Research");

        // Add participants to the undergraduate course
        course1.addParticipant(student1);
        course1.addParticipant(professor1);

        // Add participants to the graduate course
        course2.addParticipant(student2);

        // Display the participants in the undergraduate course
        System.out.println("Participants in " + course1.getCourseName() + ":");
        displayParticipants(course1.getParticipants());

        // Display the participants in the graduate course
        System.out.println("\nParticipants in " + course2.getCourseName() + ":");
        displayParticipants(course2.getParticipants());
    }

    // Helper method to display participants and their roles in a course
    private static void displayParticipants(List<Person> participants) {
        for (Person p : participants) {
            System.out.println(p.getName() + " is a " + p.getRole());  // Print each participant's name and role
        }
    }
}

