package P14;

public class PengunjungCafe27 {

    public static void daftarPengunjung27(String... namaPengunjung27) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama27 : namaPengunjung27) {
        System.out.println("- " + nama27);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung27("Ali", "Budi", "Citra");
        daftarPengunjung27("Andi"); 
        daftarPengunjung27("Doni", "Eti", "Fahmi", "Galih");
    }
}