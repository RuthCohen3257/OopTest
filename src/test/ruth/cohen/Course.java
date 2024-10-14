package test.ruth.cohen;

import java.util.List;

// Interface representing a course in the university
public interface Course {
    String getCourseName();  // Method to get the course name
    String getCourseCode();  // Method to get the course code
    void addParticipant(Person person);  // Method to add a participant (either student or professor)
    List<Person> getParticipants();  // Method to get the list of participants in the course
}

