package com.school;

public class students {
    int studentId;
    String name;

    public void setDetails(int id, String StudentName) {
        this.studentId = id;
        this.name = StudentName;
    }
    
    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
        
    }
}
