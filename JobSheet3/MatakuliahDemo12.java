package JobSheet3;

import java.util.Scanner;

public class MatakuliahDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input jumlah matakuliah: ");
        int length = Integer.parseInt(sc.nextLine());
        
        Matakuliah12[] arrayOfMatakuliah = new Matakuliah12[length];
        String code, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan data matakuliah ke-" + (i + 1));
            System.out.print("Code        : ");
            code = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah12(); 
            arrayOfMatakuliah[i].addData(code, nama, sks, jumlahJam); 
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].printInfo(); 
        }
        
        sc.close();
    }
}