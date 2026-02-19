package JobSheet2;

public class Mahasiswa12 {

    public Mahasiswa12(){

    }

    public Mahasiswa12 (String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    Mahasiswa12 mhs1 = new Mahasiswa12();
    mhs1.nama = "Muhammad Ali Farhan";
    mhs1.nim = "2241720171";
    mhs1.kelas = "SI 2J";
    mhs1.ipk = 3.55;

    mhsl.tampilkanInformasi();
    mhsl.ubahKelas("SI 2K");
    mhsl.udpdateIPK(3.60);
    mhsl.tampilkanInformasi();

    Mahasiswa12 mhs2 = new Mahasiswa12("Annisa Nabila", "2141720160", 3.25, "TI 2L");

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