package week5;

import java.util.Scanner;

public class summaryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input element number: ");
        int element = sc.nextInt();

        summary sum = new summary(element);
        for (int i = 0; i < element; i++){
            System.out.println("Input profit for " + (i + 1) + ": ");
            sum.profits[i] = sc.nextDouble();
        }

        System.out.println("Total profit using Brute Force: " + sum.totalBrute());
        System.out.println("Total profit using Divide and Conquer: " + sum.totalConquer(sum.profits, 0, element - 1));

        sc.close();

    }
}
