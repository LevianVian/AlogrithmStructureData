package Jobsheet12.week12;

public class Student12 {
    String nim, name, className;
    double gpa;

    public Student12(){}
        public Student12(String nm, String nama, String kls, double ip) {
            nim = nm;
            name = nama;
            className = kls;
            gpa = ip;
        }
        void print(){
            System.out.println(nim+" - " +name+" - " +className+" - "+ gpa);
        }
    }