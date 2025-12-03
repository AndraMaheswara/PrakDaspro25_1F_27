package P14;
import java.util.Scanner;
public class Kafe27 {
    
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);
        Menu27("Budi",true," ");

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu27 = andra.nextInt();
        
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem27 = andra.nextInt();
        
        int totalHarga27 = hitungTotalHarga27(pilihanMenu27,banyakItem27, " ");
        
        System.out.println("Total harga untuk pesanan Anda: Rp.1 " + totalHarga27);
    }

    public static void Menu27(String namaPelanggan27, boolean isMember27, String kodePromo27){
        System.out.println("Selamat datang " +namaPelanggan27+ "!");
        

        if (isMember27){
            System.out.println("Anda adalah member, dapat diskon 10% untuk setiap pembelian!");
        }

        System.out.println();
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   Rp 15,000");
        System.out.println("2. Cappuccino   Rp 20,000");
        System.out.println("3. Latte        Rp 22,000");
        System.out.println("4. Teh Tarik    Rp 12,000");
        System.out.println("5. Roti Bakar   Rp 10,000");
        System.out.println("6. Mie Goreng   Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");


        if (kodePromo27.equals("DISKON50")) {
            System.out.println("Diskon 50% Berlaku");
        } else if (kodePromo27.equals("DISKON30")) {
            System.out.println("Diskon 30% Berlaku");
        } else {
            System.out.println("Kode invalid");
        }


    }




    public static int hitungTotalHarga27 (int pilihanMenu27, int banyakItem27, String kodePromo27) {
        int[] hargaItem27 = {15000,20000,22000,12000,10000,18000};

        int hargaTotal27= hargaItem27[pilihanMenu27-1]*banyakItem27;
        

        if (kodePromo27.equals("DISKON50")) {
        ;
        hargaTotal27 = (int)(hargaTotal27 * 0.5);
        } else if (kodePromo27.equals("DISKON30")) {
        ;
        hargaTotal27 = (int)(hargaTotal27 * 0.7);
        } else {
        System.out.println("Kode invalid.");
        
        
        }
        return hargaTotal27;
    }
}
