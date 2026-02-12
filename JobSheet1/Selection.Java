import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==========================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = input.nextInt();
        System.out.println("===========================");
        System.out.println("===========================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
            System.out.println("==========================");
        } 
        else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            String grade;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                grade = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                grade = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                grade = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                grade = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                grade = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                grade = "D";
            } 
            else { 
                grade = "E";
            }

            String status;
            if (nilaiAkhir <= 50) {
                status = "MAAF ANDA TIDAK LULUS";
            } else {
                status = "SELAMAT ANDA LULUS";
            }

            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Grade: " + grade);
            System.out.println("===========================");
            System.out.println("===========================");
            System.out.println("Status: " + status);
            
        } 
    }
}