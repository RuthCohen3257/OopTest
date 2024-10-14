package test.ruth.cohen;

import java.util.ArrayList;
import java.util.List;

// Class representing a graduate course, implementing the Course interface
public class GraduateCourse implements Course {
    private String courseName;  // Name of the course
    private String courseCode;  // Code of the course
    private String researchFocus;  // Specific research focus of the graduate course
    private List<Person> participants;  // List of participants in the course

    // Constructor to initialize the course name, code, and research focus
    public GraduateCourse(String courseName, String courseCode, String researchFocus) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.researchFocus = researchFocus;
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

    // Method to get the research focus of the course
    public String getResearchFocus() {
        return researchFocus;
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

