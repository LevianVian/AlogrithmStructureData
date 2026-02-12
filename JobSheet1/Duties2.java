import java.util.Scanner;

public class Duties2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();
        input.nextLine();
        String[][] jadwal = new String[n][4];
        inputData(jadwal);

        while (true) {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Seluruh Jadwal (Table)");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Nama Matkul");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            int menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {
                tampilkanSeluruhJadwal(jadwal);
            } else if (menu == 2) {
                System.out.print("Masukkan hari yang dicari (Senin/Selasa/dll): ");
                String hari = input.nextLine();
                tampilkanJadwalPerHari(jadwal, hari);
            } else if (menu == 3) {
                System.out.print("Masukkan nama mata kuliah yang dicari: ");
                String nama = input.nextLine();
                tampilkanJadwalPerMatkul(jadwal, nama);
            } else if (menu == 4) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }

    static void inputData(String[][] arrayJadwal) {
        for (int i = 0; i < arrayJadwal.length; i++) {
            System.out.println("\nData Mata Kuliah ke-" + (i + 1));
            
            System.out.print("Nama Matkul : ");
            arrayJadwal[i][0] = input.nextLine();

            System.out.print("Ruangan     : ");
            arrayJadwal[i][1] = input.nextLine();

            System.out.print("Hari        : ");
            arrayJadwal[i][2] = input.nextLine();

            System.out.print("Jam         : ");
            arrayJadwal[i][3] = input.nextLine();
        }
    }

    static void tampilkanSeluruhJadwal(String[][] arrayJadwal) {
        System.out.println("\n--- SELURUH JADWAL KULIAH ---");
        System.out.println("Mata Kuliah         | Ruangan  | Hari       | Jam");
        System.out.println("-------------------------------------------------------");
        
        for (int i = 0; i < arrayJadwal.length; i++) {
            System.out.println(arrayJadwal[i][0] + "\t| " + arrayJadwal[i][1] + "   \t| " + arrayJadwal[i][2] + "  \t| " + arrayJadwal[i][3]);
        }
    }

    static void tampilkanJadwalPerHari(String[][] arrayJadwal, String cariHari) {
        System.out.println("\n--- JADWAL HARI " + cariHari.toUpperCase() + " ---");
        boolean ditemukan = false;

        for (int i = 0; i < arrayJadwal.length; i++) {
            if (arrayJadwal[i][2].equalsIgnoreCase(cariHari)) {
                System.out.println("Matkul  : " + arrayJadwal[i][0]);
                System.out.println("Ruangan : " + arrayJadwal[i][1]);
                System.out.println("Jam     : " + arrayJadwal[i][3]);
                System.out.println("- - - - -");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah di hari " + cariHari);
        }
    }

    static void tampilkanJadwalPerMatkul(String[][] arrayJadwal, String cariNama) {
        System.out.println("\n--- PENCARIAN MATKUL: " + cariNama + " ---");
        boolean ditemukan = false;

        for (int i = 0; i < arrayJadwal.length; i++) {
            if (arrayJadwal[i][0].equalsIgnoreCase(cariNama)) {
                System.out.println("Ditemukan!");
                System.out.println("Ruangan : " + arrayJadwal[i][1]);
                System.out.println("Hari    : " + arrayJadwal[i][2]);
                System.out.println("Jam     : " + arrayJadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}