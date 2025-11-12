package P11;

// Nama file: TugasPemesanan27.java
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan27 = andra.nextInt();
        andra.nextLine();


        String[] namaPesanan27 = new String[jumlahPesanan27];
        double[] hargaPesanan27 = new double[jumlahPesanan27];
        double totalBiaya27 = 0;

     
        for (int i = 0; i < jumlahPesanan27; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan27[i] = andra.nextLine();
            System.out.print("Masukkan harga: Rp");
            hargaPesanan27[i] = andra.nextDouble();
            andra.nextLine(); 

            totalBiaya27 += hargaPesanan27[i];
        }

    
        System.out.println("=== Daftar Pesanan Kafe ===");
        for (int i = 0; i < jumlahPesanan27; i++) {
            System.out.println((i + 1) + ". " + namaPesanan27[i] + " - Rp" + hargaPesanan27[i]);
        }


        System.out.println("Total biaya seluruh pesanan: Rp" + totalBiaya27);

    }
}

