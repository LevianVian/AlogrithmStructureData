package Jobsheet11.assignment;

import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue queue = new KRSQueue(10); 
        int choice;

        do {
            System.out.println("\n=== DPA KRS Approval Service ===");
            System.out.println("1. Register Student to Queue (Enqueue)");
            System.out.println("2. Process KRS Approvals (Dequeue 2 students)");
            System.out.println("3. Show All Students in Queue");
            System.out.println("4. Show First Two Students");
            System.out.println("5. Show Last Student");
            System.out.println("6. Display Approval Statistics");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose a menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Study Program: ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Class: ");
                    String className = sc.nextLine();
                    
                    Student std = new Student(nim, name, studyProgram, className);
                    queue.enqueue(std);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.peekTwo();
                    break;
                case 5:
                    queue.peekRear();
                    break;
                case 6:
                    queue.printStats();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Exiting service. Thank you!");
                    break;
                default:
                    System.out.println("Invalid menu selection!");
            }
        } while (choice != 0);

        sc.close();
    }
}
