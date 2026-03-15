package week5;

import java.util.Scanner;

public class powerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input element number: ");
        int element = sc.nextInt();

        power[] pwr = new power[element];
        for (int i = 0; i < element; i++){
            System.out.println("Input base number for " + (i + 1) + "th element: ");
            int base = sc.nextInt();
            System.out.println("Input exponent number for " + (i + 1) + "th element: ");
            int expo = sc.nextInt();
            pwr[i] = new power(base, expo);
        }

        System.out.println("Result using Brute Force: ");
        for (power p : pwr){
            System.out.println(p.baseNumber + " ^ " + p.exponent + " = " + p.powerBrute(p.baseNumber, p.exponent));
        }

        System.out.println("Result using Divide and Conquer: ");
        for (power p : pwr){
            System.out.println(p.baseNumber + " ^ " + p.exponent + " = " + p.powerConquer(p.baseNumber, p.exponent));
        }

        sc.close();

    }
}
