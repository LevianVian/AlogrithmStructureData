package Jobsheet5;

public class Student12 {
    String nim;
    String name;
    String studentClass;
    double gpa;

    public Student12() {
    }

    public Student12(String nim, String name, String studentClass, double gpa) {
        this.nim = nim;
        this.name = name;
        this.studentClass = studentClass;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println("NIM: " + nim + ", Name: " + name + ", Class: " + studentClass + ", GPA: " + gpa);
    }
}