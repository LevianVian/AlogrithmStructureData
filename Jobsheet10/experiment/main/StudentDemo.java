package Jobsheet10.experiment.main;

import Jobsheet10.experiment.model.Student12;
import Jobsheet10.experiment.structure.StudentAssignmentStack12;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        StudentAssignmentStack12 stack = new StudentAssignmentStack12(5);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    
                    Student12 std = new Student12(nim, name, className);
                    stack.push(std);
                    System.out.printf("%s's assignment has been successfully submitted!!\n", std.getName());
                    break;
                case 2:
                    Student12 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.getName());
                        System.out.print("Input grade (0-100): ");
                        int grade = scan.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment grade of %s is %d\n", graded.getName(), grade);
                    }
                    break;
                case 3:
                    Student12 viewed = stack.peek();
                    if (viewed != null) {
                        System.out.println("The last assignment comes from " + viewed.getName());
                    }
                    break;
                case 4:
                    System.out.println("Assignment list:");
                    System.out.println("Name\tNIM\tClass Name");
                    stack.print();
                    break;
                default:
                    if (choice < 1 || choice > 4) {
                        System.out.println("Invalid choice.");
                    }
            }
        } while (choice >= 1 && choice <= 4);
        
        scan.close();
    }
}