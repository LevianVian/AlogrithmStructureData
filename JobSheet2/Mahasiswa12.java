package JobSheet2;

public class Mahasiswa12 {
    String nama;
    String nim;
    String kelas;
    Double ipk;

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void udpdateIPK(Double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        ipk = ipkBaru;
        } else {
        System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
        }
    }

    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}