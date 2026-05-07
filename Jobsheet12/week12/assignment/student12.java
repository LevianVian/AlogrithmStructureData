package Jobsheet12.week12.assignment;

public class student12 {
    String nim, name, className;
    double gpa;

    public student12(String nim, String name, String className, double gpa) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

    void print() {
        System.out.println("NIM: " + nim + " | Name: " + name + " | Class: " + className + " | GPA: " + gpa);
    }
}
