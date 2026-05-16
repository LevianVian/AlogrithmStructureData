package DoubleLinkedList.experiment1;

public class Student {
    String nim, name, Classname;
    double gpa;

    public Student(){
    }

    public Student(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        Classname = kls;
        gpa = ip;
    }

    void print(){
        System.out.println(nim + " " + name + " " + Classname + " " + gpa);
    }
}