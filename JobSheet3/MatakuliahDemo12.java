package JobSheet3;

import java.util.Scanner;

public class MatakuliahDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah12[] arrayOfMatakuliah = new Matakuliah12[3];
        String code, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++){
            System.out.println("Masukkan data matakuliah ke-" + (i +1));
            System.out.println("Code        :");
            code = sc.nextLine();
            System.out.println("Nama        :");
            nama = sc.nextLine();
            System.out.println("SKS         :");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah Jam  :");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah12(code, nama, sks, jumlahJam);
        }

        for (int i=0; i < 3; i++){
            System.out.println("Data Matakuliah ke-" + (i +1));
            System.out.println("Code        : " + arrayOfMatakuliah[i].code);
            System.out.println("Nama        : " + arrayOfMatakuliah[i].name);
            System.out.println("SKS         : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("-------------------------------");
        }
    }
}
