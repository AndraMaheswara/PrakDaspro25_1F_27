package P14;

import java.util.Scanner;

public class HitungBalok27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);
        int p27, l27, t27, L27, vol27;

        System.out.println("Masukkan panjang");
        p27 = andra.nextInt();
        System.out.println("Masukkan lebar");
        l27 = andra.nextInt();
        System.out.println("Masukkan tinggi");
        t27 = andra.nextInt();

        L27 = p27 * l27;
        System.out.println("Luas Persegi Panjang adalah " + L27);

        vol27 = p27 * l27 * t27;
        System.out.println("Volume Balok adalah " + vol27);
        
        
    }
}