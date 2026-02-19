package JobSheet2;

public class StudentMain12 {

    public static void main(String[] args) {
        Mahasiswa12 mhsl = new Mahasiswa12();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.udpdateIPK(3.60);
        mhsl.tampilkanInformasi();
    }
}
