package JobSheet3;

public class DataDosen12 {

    public void dataSemuaDosen(Dosen12[] arrayOfDosen) {
        System.out.println("=== DATA SEMUA DOSEN ===");
        for (Dosen12 dosen : arrayOfDosen) {
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("-------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
        System.out.println("-------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int usiaPria = 0, pria = 0;
        int usiaWanita = 0, wanita = 0;
        
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                usiaPria += dosen.usia;
                pria++;
            } else {
                usiaWanita += dosen.usia;
                wanita++;
            }
        }
        System.out.println("=== RATA-RATA USIA DOSEN ===");
        if (pria > 0) System.out.println("Pria   : " + ((double) usiaPria / pria));
        if (wanita > 0) System.out.println("Wanita : " + ((double) usiaWanita / wanita));
        System.out.println("-------------------------------");
    }

    public void infoDosenPalingTua(Dosen12[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        
        Dosen12 tertua = arrayOfDosen[0];
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("=== DOSEN PALING TUA ===");
        System.out.println("Kode          : " + tertua.kode);
        System.out.println("Nama          : " + tertua.nama);
        System.out.println("Jenis Kelamin : " + (tertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + tertua.usia);
        System.out.println("-------------------------------");
    }

    public void infoDosenPalingMuda(Dosen12[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        
        Dosen12 termuda = arrayOfDosen[0];
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("=== DOSEN PALING MUDA ===");
        System.out.println("Kode          : " + termuda.kode);
        System.out.println("Nama          : " + termuda.nama);
        System.out.println("Jenis Kelamin : " + (termuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + termuda.usia);
        System.out.println("-------------------------------");
    }
}