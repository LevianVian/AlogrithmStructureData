package JobSheet2;

public class LecturerMain12 {
    public static void main(String[] args) {

        Lecturer12 lec1 = new Lecturer12("L01", "Ma'am Vivin Ayu Lestari, S.Pd., M.Kom.", true, 2015, "Algorithm and Data Structures");

        Lecturer12 lec2 = new Lecturer12();
        lec2.idLecturer = "L02";
        lec2.name = "Ma'am Wilda Imama Sabilla, S.Kom., M.Kom.";
        lec2.statusActive = true;
        lec2.yearOfEntry = 2016;
        lec2.expertiseCompetency = "Data Base";

        System.out.println("Processing Lecturer 1...");
        lec1.displayInformation();
        System.out.println("Years worked: " + lec1.calculateTimeWork(2026));
        lec1.changeSkill("Machine Learning");
        lec1.displayInformation();

        System.out.println("Processing Lecturer 2...");
        lec2.displayInformation();
        lec2.setStatusActive(true);
        System.out.println("Years worked: " + lec2.calculateTimeWork(2026));
        lec2.displayInformation();
    }
}
