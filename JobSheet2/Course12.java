package JobSheet2;

public class Course12 {
    String kodeCourse;
    String name;
    int sks;
    int numberOfHours;

    public Course12() {
    }

    public Course12(String kode, String nm, int sks, int hrs) {
        this.kodeCourse = kode;
        this.name = nm;
        this.sks = sks;
        this.numberOfHours = hrs;
    }

    void displayInformation() {
        System.out.println("Course Code: " + kodeCourse);
        System.out.println("Name       : " + name);
        System.out.println("SKS        : " + sks);
        System.out.println("Hours/Week : " + numberOfHours);
        System.out.println("---------------------------");
    }

    void changeSKS(int sksNew) {
        this.sks = sksNew;
        System.out.println("SKS has been changed to: " + sks);
    }

    void addHour(int hours) {
        this.numberOfHours += hours;
        System.out.println("Hours added. New total hours: " + numberOfHours);
    }

    void reduceHours(int hours) {
        if (this.numberOfHours >= hours) {
            this.numberOfHours -= hours;
            System.out.println("Hours reduced. New total hours: " + numberOfHours);
        } else {
            System.out.println("Reduction failed! Insufficient hours.");
        }
    }
}
