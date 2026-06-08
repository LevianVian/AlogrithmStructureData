package Jobsheet14;

public class Student12 {
    String nim, name, className;
    double ipk;

    public Student12() {
    }

    public Student12(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        ipk = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " " + className + " " + ipk);
    }
}