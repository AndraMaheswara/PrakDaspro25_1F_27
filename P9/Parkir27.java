package P9;

import java.util.Scanner;

public class Parkir27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        int jenisKendaraan27;
        double durasi27, biayaParkir27, totalPendapatan27 = 0;

        do {
            System.out.print("\nMasukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Selesai): ");
            jenisKendaraan27 = andra.nextInt();

            if (jenisKendaraan27 == 0) {
                break;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi27 = andra.nextDouble();

            if (durasi27 > 5) {
                biayaParkir27 = 12500;
            } else {
                if (jenisKendaraan27 == 1) {
                    biayaParkir27 = durasi27 * 3000;
                } else if (jenisKendaraan27 == 2) {
                    biayaParkir27 = durasi27 * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid!");
                    continue;
                }
            }

            totalPendapatan27 += biayaParkir27;
            System.out.println("Biaya parkir: Rp " + biayaParkir27);
            System.out.println("------------------------------------------");

        } while (jenisKendaraan27 != 0);

        System.out.println("\nTotal pendapatan parkir hari ini: Rp " + totalPendapatan27);

    }
}
