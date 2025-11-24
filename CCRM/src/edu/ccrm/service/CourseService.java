package edu.ccrm.service;
import java.util.ArrayList;
import java.util.List;
import edu.ccrm.domain.Course;

public class CourseService {
    private final List<Course> courses = new ArrayList<>();
    
    public void addCourse(Course c) {
        courses.add(c);
        System.out.println("Course added: " + c);
    }
    
    public void listCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }
        for (Course c : courses) {
            System.out.println(c);
        }
    }
    
    public Course findCourseByCode(String code) {
        for (Course c : courses) {
            if (c.getCode().equals(code)) {
                return c;
            }
        }
        return null;
    }
    
    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }
}