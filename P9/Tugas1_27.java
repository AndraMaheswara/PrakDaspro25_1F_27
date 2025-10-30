package P9;

import java.util.Scanner;

public class Tugas1_27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        int jumlahPelanggan27, jumlahTiket27;
        double hargaTiket27 = 50000, totalPenjualan27 = 0;

        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        jumlahPelanggan27 = andra.nextInt();

        for (int i = 1; i <= jumlahPelanggan27; i++) {
            do {
                System.out.print("Masukkan jumlah tiket yang dibeli pelanggan ke-" + i + ": ");
                jumlahTiket27 = andra.nextInt();

                if (jumlahTiket27 < 0) {
                    System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.");
                }
            } while (jumlahTiket27 < 0);

            double totalHarga27 = jumlahTiket27 * hargaTiket27;

            if (jumlahTiket27 > 10) {
                totalHarga27 *= 0.85;
            } else if (jumlahTiket27 > 4) {
                totalHarga27 *= 0.90;
            }

            totalPenjualan27 += totalHarga27;

            System.out.println("Total harga untuk pelanggan ke-" + i + ": Rp " + totalHarga27);
            System.out.println("------------------------------------------");
        }

        System.out.println("Total penjualan tiket hari ini: Rp " + totalPenjualan27);

    }
}