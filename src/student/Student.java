/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author robin
 */
public class Student {
    
    
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void sayName() {
        System.out.println("My name is " + name);
    }


    public static void main(String[] args) {
        Student[] students = new Student[3];
        
        students[0] = new Student("Alice", 1001);
        students[1] = new Student("Bob", 1002);
        students[2] = new Student("Charlie", 1003);
        
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudentID());
            student.sayName();
            System.out.println();
        }
    }
}


    
    
