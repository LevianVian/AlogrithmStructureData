package Jobsheet12.week12.assignment;

import java.util.Scanner;

import Jobsheet12.week12.assignment.studentqueue12;

public class main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        studentqueue12 queue = new studentqueue12();
        int menu;

        do {
            System.out.println("\n=== STUDENT SERVICE QUEUE ===");
            System.out.println("1. Join Queue (Register Student)");
            System.out.println("2. Call Next Student (Dequeue)");
            System.out.println("3. Check First Student (Front)");
            System.out.println("4. Check Last Student (Rear)");
            System.out.println("5. View All Students & Total Count");
            System.out.println("6. Clear Entire Queue");
            System.out.println("0. Exit");
            System.out.print("Select menu (0-6): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Input NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Input Name: ");
                    String name = sc.nextLine();
                    System.out.print("Input Class: ");
                    String className = sc.nextLine();
                    System.out.print("Input GPA: ");
                    double gpa = sc.nextDouble();
                    sc.nextLine(); 
                    
                    student12 newStudent = new student12(nim, name, className, gpa);
                    queue.enqueue(newStudent);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    queue.printQueue();
                    break;
                case 6:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid menu option.");
            }
        } while (menu != 0);

        sc.close();
    }
}
