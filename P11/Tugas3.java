package P11;
import java.util.Scanner;
public class Tugas3 {
    
  


    public static void main(String[] args) {
        Scanner andra27 = new Scanner(System.in);


        String[] menu27 = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu27.length; i++) {
            System.out.println((i + 1) + ". " + menu27[i]);
        }

    
        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cari27 = andra27.nextLine();


        boolean ditemukan27 = false;
        int indeks27 = -1;

        for (int i = 0; i < menu27.length; i++) {
            if (menu27[i].equalsIgnoreCase(cari27)) { 
                ditemukan27 = true;
                indeks27 = i;
                break;
            }
        }


        System.out.println();
        if (ditemukan27) {
            System.out.println(cari27 + " tersedia di menu .");
        } else {
            System.out.println("Maaf, " + cari27 + " tidak tersedia di menu.");
        }


    }
}

