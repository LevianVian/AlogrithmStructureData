package JobSheet2;

public class Mahasiswa12 {

    String nama;
    String nim;
    String kelas;
    Double ipk;


    public Mahasiswa12() {
    }


    public Mahasiswa12(String nm, String nim, double ipk, String kls) {
        this.nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void udpdateIPK(Double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
        }
    }
}