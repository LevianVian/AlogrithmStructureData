package week5;

import java.util.Scanner;

public class mainFactorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int num = input.nextInt();
        
        factorial fk = new factorial();
        
        System.out.println("The factorial of " + num + " using BF: " + fk.factorialBF(num));
        System.out.println("The factorial of " + num + " using DC: " + fk.factorialDC(num));
        
        input.close();
    }
}