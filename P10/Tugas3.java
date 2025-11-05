package P10;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang27 = andra.nextInt();

        int totalPelanggan27 = 0;
        int totalItem27 = 0;

        System.out.println();
        System.out.println("=== Input Penjualan Per Cabang ===");

        for (int cabang27 = 1; cabang27 <= jumlahCabang27; cabang27++) {
            System.out.println();
            System.out.println("--- Cabang " + cabang27 + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan27 = andra.nextInt();

            int totalItemPerCabang27 = 0;

            for (int pelanggan27 = 1; pelanggan27 <= jumlahPelanggan27; pelanggan27++) {
                System.out.print("- Pelanggan " + pelanggan27 + " memesan berapa item? ");
                int item27 = andra.nextInt();
                totalItemPerCabang27 += item27;
            }

            System.out.println("Cabang " + cabang27 + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan27 + " orang");
            System.out.println("- Item terjual: " + totalItemPerCabang27);

            totalPelanggan27 += jumlahPelanggan27;
            totalItem27 += totalItemPerCabang27;
        }
        System.out.println();
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan27 + " orang");
        System.out.println("Item terjual: " + totalItem27 + " item");

       
    }
    
}

