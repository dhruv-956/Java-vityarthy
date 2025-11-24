package edu.ccrm.service;
import java.util.ArrayList;
import java.util.List;
import edu.ccrm.domain.Student;

public class StudentService {
    private final List<Student> students = new ArrayList<>();
    private int nextId = 1;
    
    public int getNextId() {
        return nextId++;
    }
    
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added: " + s);
    }
    
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            s.printProfile();
            System.out.println("------");
        }
    }
    
    public Student findStudentByRegNo(String regNo) {
        for (Student s : students) {
            if (s.getRegNo().equals(regNo)) {
                return s;
            }
        }
        return null;
    }
    
    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
    
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
}