package edu.ccrm.domain;

public class Course {
    private String code;
    private String title;
    private int credits;
    
    public Course(String code, String title, int credits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
    }
    
    // Getters
    public String getCode() { return code; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }
    
    // Setters
    public void setCode(String code) { this.code = code; }
    public void setTitle(String title) { this.title = title; }
    public void setCredits(int credits) { this.credits = credits; }
    
    @Override
    public String toString() {
        return code + " - " + title + " (" + credits + " credits)";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return code.equals(course.code);
    }
    
    @Override
    public int hashCode() {
        return code.hashCode();
    }
}