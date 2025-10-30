package P10;

import java.util.Scanner;

public class Tugas3_27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang: ");
        int jumlahCabang27 = andra.nextInt();

        int totalPelangganKeseluruhan27 = 0;
        int totalItemKeseluruhan27 = 0;

        for (int cabang27 = 1; cabang27 <= jumlahCabang27; cabang27++) {
            System.out.println("Cabang ke-" + cabang27);
            System.out.print("Masukkan jumlah pelanggan hari ini: ");
            int pelanggan27 = andra.nextInt();

            int totalItemCabang27 = 0;
            for (int p27 = 1; p27 <= pelanggan27; p27++) {
                System.out.print("  Jumlah item yang dipesan oleh pelanggan ke-" + p27 + ": ");
                int item27 = andra.nextInt();
                totalItemCabang27 += item27;
            }

            System.out.println("Total item terjual di cabang ke-" + cabang27 + ": " + totalItemCabang27);
            totalPelangganKeseluruhan27 += pelanggan27;
            totalItemKeseluruhan27 += totalItemCabang27;
        }

        System.out.println("Ringkasan Penjualan:");
        System.out.println("Total seluruh pelanggan: " + totalPelangganKeseluruhan27);
        System.out.println("Total seluruh item terjual: " + totalItemKeseluruhan27);
    }
}

//a