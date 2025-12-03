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

        L27 = hitungLuas27(p27, l27);
        System.out.println("Luas Persegi Panjang adalah " + L27);

        vol27 = hitungVolume27(t27, p27, l27);
        System.out.println("Volume Balok adalah " + vol27);
        
        andra.close();
    }
    static int hitungLuas27(int pjg27, int lb27) {
        int Luas27 = pjg27 * lb27;
        return Luas27;
    }
    static int hitungVolume27(int tinggi27, int a27, int b27) {
        int volume27 = hitungLuas27(a27, b27) * tinggi27;
        return volume27;
    }}
