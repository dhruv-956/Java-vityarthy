package edu.ccrm.service;
import java.util.ArrayList;
import java.util.List;
import edu.ccrm.domain.Course;
public class CourseService {
private List<Course> courses = new ArrayList<>();
public void addCourse(Course c) {
        courses.add(c);
        System.out.println("Course added: " + c);
    }    public void listCourses() {
    for (Course c : courses) {
System.out.println(c);
        }
    }
}
