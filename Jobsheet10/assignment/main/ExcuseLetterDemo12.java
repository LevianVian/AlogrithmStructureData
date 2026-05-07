package Jobsheet10.assignment.main;

import Jobsheet10.assignment.model.ExcuseLetter12;
import Jobsheet10.assignment.structure.ExcuseLetterStack12;
import java.util.Scanner;

public class ExcuseLetterDemo12 {
    public static void main(String[] args) {
        ExcuseLetterStack12 stack = new ExcuseLetterStack12(10);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Department Administrator Panel ---");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter by Name");
            System.out.println("5. Exit");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    System.out.print("Type of Excuse (S for Sick, I for Other): ");
                    char type = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = scan.nextInt();
                    scan.nextLine();

                    ExcuseLetter12 letter = new ExcuseLetter12(id, name, className, type, duration);
                    stack.push(letter);
                    System.out.println("Excuse letter successfully submitted!");
                    break;
                    
                case 2:
                    ExcuseLetter12 processed = stack.pop();
                    if (processed != null) {
                        System.out.printf("Processing letter... %s (Class %s) is excused for %d days.\n", 
                                processed.getName(), processed.getClassName(), processed.getDuration());
                    }
                    break;
                    
                case 3:
                    ExcuseLetter12 viewed = stack.peek();
                    if (viewed != null) {
                        System.out.println("The latest submitted letter is from: " + viewed.getName());
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter student name to search: ");
                    String searchName = scan.nextLine();
                    stack.search(searchName);
                    break;
                    
                case 5:
                    System.out.println("Exiting system...");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scan.close();
    }
}
