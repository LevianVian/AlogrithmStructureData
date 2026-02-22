package JobSheet2;

public class StudentMain12 {
    public static void main(String[] args) {
        Mahasiswa12 mhs1 = new Mahasiswa12();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.udpdateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa12 mhs2 = new Mahasiswa12("Annisa Nabila", "2141720160", 3.3, "TI 2L");
        mhs2.tampilkanInformasi();

        Mahasiswa12 mhs3 = new Mahasiswa12("Levian Arta", "2441720000", 3.90, "SIB 1G");
        mhs3.tampilkanInformasi();

    }
}