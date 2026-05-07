package Jobsheet11;

public class Student12 {
    String nim;
    String name;
    String studyProgram;
    String className;

    public Student12(String nim, String name, String studyProgram, String className) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.className = className;
    }

    void print() {
        System.out.println(nim + " " + name + " " + studyProgram + " - " + className);
    }
}
