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
    
    // Getters
    public int getId() { return id; }
    public String getRegNo() { return regNo; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public boolean isActive() { return active; }
    public LocalDate getCreatedOn() { return createdOn; }
    public List<Course> getEnrolledCourses() { return enrolledCourses; }
    
    // Setters
    public void setRegNo(String regNo) { this.regNo = regNo; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setEmail(String email) { this.email = email; }
    public void setActive(boolean active) { this.active = active; }
    
    public void enrollCourse(Course c) {
        if (!enrolledCourses.contains(c)) {
            enrolledCourses.add(c);
        }
    }
    
    public void printProfile() {
        System.out.println("Student: " + fullName + " (" + regNo + ")");
        System.out.println("Email: " + email);
        System.out.println("Active: " + active);
        System.out.println("Enrolled Courses:");
        if (enrolledCourses.isEmpty()) {
            System.out.println(" - None");
        } else {
            for (Course c : enrolledCourses) {
                System.out.println(" - " + c.getTitle());
            }
        }
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", regNo='" + regNo + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}