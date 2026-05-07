package Jobsheet12.week12;

import java.util.Scanner;

public class SLLMain12 {
        public static void main(String[] args) {
        SingleLinkedList12 sll = new SingleLinkedList12();
        Scanner sc = new Scanner(System.in);

        Student12 std1 = new Student12("001", "Student 1", "TI-1I", 3.89);
        Student12 std2 = new Student12("002", "Student 2", "TI-1I", 3.45);
        Student12 std3 = new Student12("003", "Student 3", "TI-1I", 3.20);
        Student12 std4 = new Student12("004", "Student 4", "TI-1I", 3.00);

        sll.addFirst(std4);
        sll.addLast(std1);
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);

        System.out.println("--- Data Before Keyboard Input (Default) ---");
        sll.print();

        System.out.println("\n--- Add New Student ---");
        System.out.print("Input NIM: ");
        String nim = sc.nextLine();
        
        System.out.print("Input Name: ");
        String name = sc.nextLine();
        
        System.out.print("Input Class: ");
        String className = sc.nextLine();
        
        System.out.print("Input GPA: ");
        double gpa = sc.nextDouble();

        Student12 newStd = new Student12(nim, name, className, gpa);
        
        sll.addLast(newStd); 

        System.out.println("\n--- Data After Input ---");
        sll.print();
        sc.close();
    }
}