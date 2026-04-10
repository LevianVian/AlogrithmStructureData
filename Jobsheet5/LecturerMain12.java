package Jobsheet5;
import java.util.Scanner;

public class LecturerMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData12 data = new LecturerData12();
        int choice;

        do {
            System.out.println("\n=== Lecturer Management Menu ===");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Bubble Sort - Age)");
            System.out.println("4. Sort DSC (Selection Sort - Age)");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Gender (true for Male, false for Female): ");
                    boolean gender = sc.nextBoolean();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    data.add(new Lecturer12(id, name, gender, age));
                    break;
                case 2:
                    System.out.println("\nAll Lecturer Data:");
                    data.print();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("\nData sorted ASC (Youngest to Oldest).");
                    data.print();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("\nData sorted DSC (Oldest to Youngest).");
                    data.print();
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}