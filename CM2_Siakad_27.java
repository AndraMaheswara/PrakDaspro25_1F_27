import java.util.Scanner;

public class CM2_Siakad_27 {
    static Scanner andra = new Scanner(System.in);
    static String[] namaMatkul27 = {
            "Pancasila",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Bahasa Inggris 1",
            "Fisika",
            "Matematika Dasar",
            "Konsep Teknologi Informasi",
            "Keselamatan dan Kesehatan Kerja",
            "Critical Thinking n Problem solving"
    };

    static int[] bobotSks27 = { 2, 2, 3, 2, 2, 2, 2, 2, 2 };

    static String[] namaMhs27;
    static String[] nimMhs27;
    static double[][] nilaiAngka27; // baris = Mahasiswa | Kolom = matkul
    static int jumlahMhs27 = 0;

    public static void main(String[] args27) {

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMhs27 = andra.nextInt();
        andra.nextLine();

        namaMhs27 = new String[jumlahMhs27];
        nimMhs27 = new String[jumlahMhs27];
        nilaiAngka27 = new double[jumlahMhs27][namaMatkul27.length];

        int pilihanMenu27;

        do {
            tampilkanMenu27();
            pilihanMenu27 = andra.nextInt();
            andra.nextLine();

            switch (pilihanMenu27) {
                case 1:
                    inputDataNilai27();
                    break;
                case 2:
                    tampilkanKHS27();
                    break;
                case 3:
                    System.out.println("Keluar dari program. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihanMenu27 != 3);
    }

    static void tampilkanMenu27() {
        System.out.println("================================================");
        System.out.println("\t SISTEM SIAKAD SEDERHANA (MENU)");
        System.out.println("================================================");
        System.out.println("1. Input nilai mata kuliah");
        System.out.println("2. Lihat KHS (konversi & IP + status)");
        System.out.println("3. Keluar");
        System.out.println("================================================");
        System.out.print("Pilih menu (1-3): ");
    }

    static void inputDataNilai27() {
        System.out.println("Daftar Mahasiswa:");
        for (int i27 = 0; i27 < jumlahMhs27; i27++) {
            String statusData27;
            if (namaMhs27[i27] == null) {
                statusData27 = "(belum diisi)";
            } else {
                statusData27 = namaMhs27[i27];
            }
            System.out.println((i27 + 1) + ". " + statusData27);
        }

        System.out.print("Pilih nomor mahasiswa (1-" + jumlahMhs27 + "): ");
        int indexMhs27 = andra.nextInt() - 1;
        andra.nextLine();

        if (indexMhs27 < 0 || indexMhs27 >= jumlahMhs27) {
            System.out.println("[ERROR] Nomor mahasiswa tidak valid.");
            return;
        }

        System.out.println("=== INPUT NILAI MAHASISWA ===");
        System.out.print("Nama: ");
        namaMhs27[indexMhs27] = andra.nextLine();
        System.out.print("NIM : ");
        nimMhs27[indexMhs27] = andra.nextLine();

        System.out.println("Masukkan nilai (0-100) untuk mata kuliah berikut:");

        for (int j27 = 0; j27 < namaMatkul27.length; j27++) {
            double inputNilai27;
            boolean isNilaiValid27 = false;

            while (!isNilaiValid27) {
                System.out.print((j27 + 1) + ". " + namaMatkul27[j27] + ": ");
                inputNilai27 = andra.nextDouble();

                if (inputNilai27 < 0 || inputNilai27 > 100) {
                    System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100.");
                } else {
                    nilaiAngka27[indexMhs27][j27] = inputNilai27;
                    isNilaiValid27 = true;
                }
            }
        }
        andra.nextLine();
        System.out.println("[OK] Semua nilai berhasil dimasukkan.");
    }

    static void tampilkanKHS27() {
        System.out.println("Daftar Mahasiswa:");
        for (int i27 = 0; i27 < jumlahMhs27; i27++) {
            if (namaMhs27[i27] != null) {
                System.out.println((i27 + 1) + ". " + namaMhs27[i27] + " / " + nimMhs27[i27]);
            } else {
                System.out.println((i27 + 1) + ". (belum diisi) / -");
            }
        }

        System.out.print("Pilih nomor mahasiswa (1-" + jumlahMhs27 + "): ");
        int indexMhs27 = andra.nextInt() - 1;
        andra.nextLine();

        if (indexMhs27 < 0 || indexMhs27 >= jumlahMhs27 || namaMhs27[indexMhs27] == null) {
            System.out.println("Data mahasiswa belum tersedia atau input salah.");
            return;
        }
        System.out.println("================================================");
        System.out.println("\tHASIL KONVERSI NILAI MAHASISWA");
        System.out.println("================================================");
        System.out.println("Nama: " + namaMhs27[indexMhs27]);
        System.out.println("NIM : " + nimMhs27[indexMhs27]);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-40s %-5s %-10s %-10s %-10s%n", "Mata Kuliah", "SKS", "Nilai", "Huruf", "Setara");
        System.out.println("--------------------------------------------------------------------------------");

        double totalNilaiKaliSks27 = 0;
        int totalSks27 = 0;
        boolean adaNilaiE27 = false;
        boolean pancasilaKurang27 = false;

        for (int j27 = 0; j27 < namaMatkul27.length; j27++) {
            double nilai27 = nilaiAngka27[indexMhs27][j27];
            String huruf27 = konversiHuruf27(nilai27);
            double setara27 = konversiSetara27(nilai27);

            if (huruf27.equals("E")) {
                adaNilaiE27 = true;
            }
            if (namaMatkul27[j27].equalsIgnoreCase("Pancasila") && setara27 < 2.0) {
                pancasilaKurang27 = true;
            }

            totalNilaiKaliSks27 += (setara27 * bobotSks27[j27]);
            totalSks27 += bobotSks27[j27];

            System.out.printf("%-40s %-5d %-10.2f %-10s %-10s%n", namaMatkul27[j27], bobotSks27[j27], nilai27, huruf27,
                    setara27);

        }
        System.out.println("--------------------------------------------------------------------------------");

        double ip27 = totalNilaiKaliSks27 / totalSks27;
        System.out.println("Total SKS    : " + totalSks27);
        System.out.println("Total Bobot  : " + totalNilaiKaliSks27);
        System.out.println("Indeks Prestasi (IP) : " + ip27);

        String status27;
        if (ip27 >= 2.00 && !adaNilaiE27 && !pancasilaKurang27) {
            status27 = "LULUS SEMESTER";
        } else {
            status27 = "TIDAK LULUS SEMESTER";

        }

        System.out.print("Status Semester: " + status27);
        if (ip27 < 2.00) {
            System.out.print(" (Alasan: IP kurang dari 2.00)");
            System.out.println();
        }
        if (adaNilaiE27) {
            System.out.print(" (Alasan: Terdapat Nilai E)");
            System.out.println();
        }
        if (pancasilaKurang27) {
            System.out.print(" (Alasan: Nilai Pancasila kurang dari C)");
            System.out.println();
        }
        System.out.println("================================================");

    }

    static String konversiHuruf27(double nilai27) {
        if (nilai27 > 80 && nilai27 <= 100)
            return "A";
        else if (nilai27 > 73 && nilai27 <= 80)
            return "B+";
        else if (nilai27 > 65 && nilai27 <= 73)
            return "B";
        else if (nilai27 > 60 && nilai27 <= 65)
            return "C+";
        else if (nilai27 > 50 && nilai27 <= 60)
            return "C";
        else if (nilai27 > 39 && nilai27 <= 50)
            return "D";
        else
            return "E";
    }

    static double konversiSetara27(double nilai27) {
        if (nilai27 > 80 && nilai27 <= 100)
            return 4.0;
        else if (nilai27 > 73 && nilai27 <= 80)
            return 3.5;
        else if (nilai27 > 65 && nilai27 <= 73)
            return 3.0;
        else if (nilai27 > 60 && nilai27 <= 65)
            return 2.5;
        else if (nilai27 > 50 && nilai27 <= 60)
            return 2.0;
        else if (nilai27 > 39 && nilai27 <= 50)
            return 1.0;
        else
            return 0.0;
    }
}