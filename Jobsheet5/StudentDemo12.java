package Jobsheet5;
import java.util.Scanner;

public class StudentDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TopStudents12 topStudents = new TopStudents12(5);

        for (int i = 0; i < 5; i++) {
            System.out.println("Input Student " + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Class: ");
            String cls = sc.nextLine();
            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine(); // clear buffer
            topStudents.add(new Student12(nim, name, cls, gpa));
        }

        System.out.println("\nOriginal student list:");
        topStudents.print();

        System.out.println("\nSorted by GPA (Descending - Bubble):");
        topStudents.bubbleSort();
        topStudents.print();

        System.out.println("\nSorted by GPA (Ascending - Selection):");
        topStudents.selectionSort();
        topStudents.print();

        System.out.println("\nSorted by GPA (Ascending - Insertion):");
        topStudents.insertionSort();
        topStudents.print();
    }
}