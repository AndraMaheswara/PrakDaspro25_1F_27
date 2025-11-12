package P11;
import java.util.Scanner;
public class SearchNilai27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai27 = andra.nextInt();
        int[] arrNilai27 = new int[jumlahNilai27];

        for (int i = 0; i < arrNilai27.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai27[i] = andra.nextInt();
        }


        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key27 = andra.nextInt();
        int hasil27 = -1; 

        for (int i = 0; i < arrNilai27.length; i++) {
            if (key27 == arrNilai27[i]) {
                hasil27 = i;
                break;
            }
        }
        
        System.out.println();
        if (hasil27 != -1) {
            System.out.println("Nilai " + key27 + " ketemu di indeks ke-" + hasil27);}
            else {
            System.out.println("Nilai yang dicar itidak ditemukan.");
        }
         
    }
}