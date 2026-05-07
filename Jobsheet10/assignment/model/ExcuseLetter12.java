package Jobsheet10.assignment.model;

public class ExcuseLetter12 {
    private String id;
    private String name;
    private String className;
    private char typeOfExcuse;
    private int duration;

    public ExcuseLetter12() {
    }

    public ExcuseLetter12(String id, String name, String className, char typeOfExcuse, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = typeOfExcuse;
        this.duration = duration;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getClassName() { return className; }
    public char getTypeOfExcuse() { return typeOfExcuse; }
    public int getDuration() { return duration; }
}
