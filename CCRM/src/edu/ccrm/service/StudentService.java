package edu.ccrm.service;
import java.util.ArrayList;
import java.util.List;
import edu.ccrm.domain.Student;
public class StudentService {
    private List<Student> students = new ArrayList<>();
    public void addStudent(Student s) {
    students.add(s);
System.out.println("Student added: " + s);
    }    public void listStudents() {
        for (Student s : students) {
     s.printProfile();
         System.out.println("------");
        }
    }
}
