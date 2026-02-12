import java.util.Scanner;

public class ArrayPracticum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] matkul = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking and Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2}; 
        
        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] nilaiSetara = new double[8];

        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        double totalNilai = 0;
        int totalSks = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = input.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalNilai += (nilaiSetara[i] * sks[i]);
            totalSks += sks[i];
        }

        double ip = totalNilai / totalSks;

        System.out.println("=======================================================================");
        System.out.println("\t\t\tHasil Konversi Nilai");
        System.out.println("=======================================================================");
        

        System.out.println("Mata Kuliah\t\t\t\t  Nilai Angka   Nilai Huruf   Bobot");
        
        for (int i = 0; i < 8; i++) {
            System.out.print(matkul[i]);
            
            if (matkul[i].length() < 15) {
                System.out.print("\t\t\t\t    "); 
            } else if (matkul[i].length() < 25) {
                System.out.print("\t\t\t    ");  
            } else if (matkul[i].length() < 35) {
                System.out.print("\t\t    ");   
            } else {
                System.out.print("\t    ");
            }

            System.out.println(nilaiAngka[i] + "\t      " + nilaiHuruf[i] + "\t\t    " + nilaiSetara[i]);
        }

        System.out.println("=======================================================================");
        System.out.println("IP : " + (double)Math.round(ip * 100) / 100);
    }
}