package edu.ccrm.domain;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Student {
private int id;
    private String regNo;
    private String fullName;
    private String email;
private boolean active;
    private LocalDate createdOn;
    private List<Course> enrolledCourses;
    public Student(int id, String regNo, String fullName, String email) {
    this.id = id;
    this.regNo = regNo;
    this.fullName = fullName;
    this.email = email;
     this.active = true;
    this.createdOn = LocalDate.now();
    this.enrolledCourses = new ArrayList<>();
    }
    public void enrollCourse(Course c) {
enrolledCourses.add(c);
    }
    public void printProfile() {
        System.out.println("Student: " + fullName + " (" + regNo + ")");
        System.out.println("Email: " + email);
        System.out.println("Active: " + active);
        System.out.println("Enrolled Courses:");
        for (Course c : enrolledCourses) {
            System.out.println(" - " + c.getTitle());
        }
    }
}
