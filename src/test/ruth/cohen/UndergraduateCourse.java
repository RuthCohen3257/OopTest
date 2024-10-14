package test.ruth.cohen;

import java.util.ArrayList;
import java.util.List;

// Class representing an undergraduate course, implementing the Course interface
public class UndergraduateCourse implements Course {
    private String courseName;  // Name of the course
    private String courseCode;  // Code of the course
    private List<Person> participants;  // List of participants in the course

    // Constructor to initialize the course name and code
    public UndergraduateCourse(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.participants = new ArrayList<>();  // Initialize an empty list for participants
    }

    // Implementation of the getCourseName method
    @Override
    public String getCourseName() {
        return courseName;
    }

    // Implementation of the getCourseCode method
    @Override
    public String getCourseCode() {
        return courseCode;
    }

    // Method to add a participant to the course
    @Override
    public void addParticipant(Person person) {
        participants.add(person);  // Add the person to the participants list
    }

    // Method to get the list of participants in the course
    @Override
    public List<Person> getParticipants() {
        return participants;
    }
}

