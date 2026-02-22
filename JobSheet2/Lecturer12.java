package JobSheet2;

public class Lecturer12 {

    String idLecturer;
    String name;
    boolean statusActive;
    int yearOfEntry;
    String expertiseCompetency;

    
    public Lecturer12() {
    }


    public Lecturer12(String idLecturer, String name, boolean statusActive, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.statusActive = statusActive;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    
    public void displayInformation() {
        System.out.println("--- Lecturer Information ---");
        System.out.println("ID: " + idLecturer);
        System.out.println("Name: " + name);
        System.out.println("Status: " + (statusActive ? "Active" : "Inactive"));
        System.out.println("Year of Entry: " + yearOfEntry);
        System.out.println("Expertise: " + expertiseCompetency);
    }


    public void setStatusActive(boolean status) {
        this.statusActive = status;
        System.out.println("Status updated for " + name + ".");
    }


    public int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    public void changeSkill(String skill) {
        this.expertiseCompetency = skill;
        System.out.println("Expertise updated for " + name + ".");
    }
}
