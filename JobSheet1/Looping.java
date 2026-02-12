import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = input.next();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        System.out.println("n : " + n);

        int i = 1; 

        do {
            if (i == 10 || i == 15) {
                i++; 
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("#");
            } 
            else if (i % 2 == 0) {
                System.out.print(i);
            } 
            else {
                System.out.print("*");
            }
            i++; 

        } while (i <= n);
    }
}