package week5;

public class mainTask {
    public static void main(String[] args) {
        student [] student = {
            new student("Ahmad", "22010101", 2022, 78, 82),
            new student("Budi", "22010102", 2022, 85, 88),
            new student("Cindy", "22010103", 2021, 90, 87),
            new student("Dian", "22010104", 2021, 76, 79),
            new student("Eko", "22010105", 2023, 92, 95),
            new student("Fajar", "22010106", 2020, 88, 85),
            new student("Gina", "22010107", 2023, 80, 83),
            new student("Hadi", "22010108", 2020, 82, 84),
        };

        task calculate = new task();

        System.out.println("Highest midterm score: " + calculate.findMaxConquer(student, 0, student.length - 1));
        System.out.println("Lowest midterm score: " + calculate.findMaxConquer(student, 0, student.length - 1));
        System.out.println("Average final score: " + calculate.AvgBrute(student));
    }
}
