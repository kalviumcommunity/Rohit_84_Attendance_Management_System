package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        students[] studentsArray = new students[2];
        studentsArray[0] = new students();
        studentsArray[0].setDetails(1, "Alice Wonderland");
        studentsArray[1] = new students();
        studentsArray[1].setDetails(2, "Bob The Builder");

        course[] coursesArray = new course[2];
        coursesArray[0] = new course();
        coursesArray[0].setDetails(101, "Intro to Programming");
        coursesArray[1] = new course();
        coursesArray[1].setDetails(202, "Linear Algebra");

        System.out.println("\nRegistered Students:");
        for (students student : studentsArray) {
            if (student != null) student.displayDetails();
        }

        System.out.println("\nAvailable Courses:");
        for (course c : coursesArray) {
            if (c != null) c.displayDetails();
        }

        System.out.println("\nSession 2: Core Domain Modelling Complete.");
    }
}
