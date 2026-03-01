package JobSheet3;

import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        
        Dosen12[] arrayOfDosen = new Dosen12[jumlah];
        String kode, nama, jenisKelaminInput;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            jenisKelaminInput = sc.nextLine();
            
            if (jenisKelaminInput.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }
            
            System.out.print("Usia          : ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("-------------------------------");

            arrayOfDosen[i] = new Dosen12(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n");
        
        System.out.println("=== DATA DOSEN (FOREACH LOOP) ===");
        for (Dosen12 dosen : arrayOfDosen) {
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("-------------------------------");
        }
        
        System.out.println("\n");

        DataDosen12 pencariData = new DataDosen12();
        
        pencariData.dataSemuaDosen(arrayOfDosen);
        pencariData.jumlahDosenPerJenisKelamin(arrayOfDosen);
        pencariData.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        pencariData.infoDosenPalingTua(arrayOfDosen);
        pencariData.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}