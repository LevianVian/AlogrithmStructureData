package JobSheet2;

public class CourseMain12 {
    public static void main(String[] args) {
        // 1. Using Default Constructor
        Course12 course1 = new Course12();
        course1.kodeCourse = "ASD1";
        course1.name = "Algorithms and Data Structures";
        course1.sks = 3;
        course1.numberOfHours = 6;
        
        Course12 course2 = new Course12("BASE2", "Database Systems", 2, 4);

        course1.displayInformation();
        course1.changeSKS(4);
        course1.addHour(2);
        course1.displayInformation();

        course2.displayInformation();
        course2.reduceHours(5);
        course2.reduceHours(2); 
        course2.displayInformation();
    }
}