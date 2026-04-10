package Jobsheet5;

public class SortingMain12 {
    public static void main(String[] args) {
        // Bubble Sort
        int[] a = {34, 7, 23, 32, 5, 62};
        Sorting12 sorting1 = new Sorting12(a);
        System.out.println("Original array (a):");
        sorting1.print();
        sorting1.bubbleSort();
        System.out.println("Sorted array (Bubble Sort):");
        sorting1.print();

        // Ini Selectionnya
        int[] b = {30, 20, 2, 8, 14};
        Sorting12 sorting2 = new Sorting12(b);
        System.out.println("\nOriginal array (b):");
        sorting2.print();
        sorting2.selectionSort();
        System.out.println("Sorted array (Selection Sort):");
        sorting2.print();

        // Buat Insertionnya
        int[] c = {40, 10, 4, 9, 3};
        Sorting12 sorting3 = new Sorting12(c);
        System.out.println("\nOriginal array (c):");
        sorting3.print();
        sorting3.insertionSort();
        System.out.println("Sorted array (Insertion Sort):");
        sorting3.print();
    }
}