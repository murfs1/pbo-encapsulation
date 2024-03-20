/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data for student
        System.out.println("Enter student's name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter student's address:");
        String studentAddress = scanner.nextLine();
        Student student = new Student(studentName, studentAddress);

        // Input courses and grades for student
        System.out.println("Enter number of courses for the student:");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter course name:");
            String course = scanner.nextLine();
            System.out.println("Enter grade for course " + course + ":");
            int grade = scanner.nextInt();
            student.addCourseGrade(course, grade);
            scanner.nextLine(); // consume newline
        }

        // Input data for teacher
        System.out.println("\nEnter teacher's name:");
        String teacherName = scanner.nextLine();
        System.out.println("Enter teacher's address:");
        String teacherAddress = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAddress);

        // Input courses taught by teacher
        System.out.println("Enter number of courses taught by the teacher:");
        int numCoursesTaught = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 0; i < numCoursesTaught; i++) {
            System.out.println("Enter course name taught by the teacher:");
            String course = scanner.nextLine();
            teacher.addCourse(course);
        }

        // Display student and teacher information
        System.out.println("\nStudent Information:");
        System.out.println(student);
        System.out.println("Grades:");
        student.printGrades();
        System.out.println("Average Grade: " + student.getAverageGrade());

        System.out.println("\nTeacher Information:");
        System.out.println(teacher);
        System.out.println("Courses Taught:");
        for (String course : teacher.courses) {
            System.out.println(course);
        }

        scanner.close();
    }
}




