package JobSheet3;

public class Matakuliah12 {
    public String code;
    public String name;
    public int sks;
    public int jumlahJam;

    public Matakuliah12() {
    }

    public Matakuliah12(String code, String name, int sks, int jumlahJam) {
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void addData(String code, String name, int sks, int jumlahJam) {
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void printInfo() {
        System.out.println("Code        : " + this.code);
        System.out.println("Nama        : " + this.name);
        System.out.println("SKS         : " + this.sks);
        System.out.println("Jumlah Jam  : " + this.jumlahJam);
        System.out.println("-------------------------------");
    }
}