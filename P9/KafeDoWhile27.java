package P9;

import java.util.Scanner;

public class KafeDoWhile27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;

        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        double totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = andra.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = andra.nextInt();
            System.out.print("Jumlah teh: ");
            teh = andra.nextInt();
            System.out.print("Jumlah roti: ");
            roti = andra.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            andra.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");

    }

}
//aa