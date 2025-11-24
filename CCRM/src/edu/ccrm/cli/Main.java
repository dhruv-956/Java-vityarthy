package edu.ccrm.cli;
import java.util.Scanner;
import edu.ccrm.domain.*;
import edu.ccrm.service.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        int choice;
        
        do {
            System.out.println("\n=== CCRM MENU ===");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Add Course");
            System.out.println("4. List Courses");
            System.out.println("5. Enroll Student in Course");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1 -> {
                    System.out.print("RegNo: ");
                    String reg = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    Student s = new Student(studentService.getNextId(), reg, name, email);
                    studentService.addStudent(s);
                }
                case 2 -> studentService.listStudents();
                case 3 -> {
                    System.out.print("Code: ");
                    String code = sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Credits: ");
                    int credits = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    Course c = new Course(code, title, credits);
                    courseService.addCourse(c);
                }
                case 4 -> courseService.listCourses();
                case 5 -> {
                    System.out.print("Student RegNo: ");
                    String regNo = sc.nextLine();
                    System.out.print("Course Code: ");
                    String courseCode = sc.nextLine();
                    
                    Student student = studentService.findStudentByRegNo(regNo);
                    Course course = courseService.findCourseByCode(courseCode);
                    
                    if (student != null && course != null) {
                        student.enrollCourse(course);
                        System.out.println("Student enrolled successfully!");
                    } else {
                        System.out.println("Student or Course not found!");
                    }
                }
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}