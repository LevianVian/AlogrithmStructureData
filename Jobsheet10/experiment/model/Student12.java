package Jobsheet10.experiment.model;

public class Student12 {
    private String nim;
    private String name;
    private String className;
    private int grade;

    public Student12(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }

    public void grading(int grade) {
        this.grade = grade;
    }

    public String getNim() { return nim; }
    public String getName() { return name; }
    public String getClassName() { return className; }
    public int getGrade() { return grade; }
}