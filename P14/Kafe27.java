package P14;

public class Kafe27 {
    
    public static void main(String[] args) {
        Menu27("Andi",true);
    }


    public static void Menu27(String namaPelanggan27, boolean isMember27) {
        System.out.println();
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
    }

    
}
