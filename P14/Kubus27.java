package P14;
import java.util.Scanner;

public class Kubus27 {
    public static int hitungVolume27(int s27) {
        return s27 * s27 * s27;
    }
    public static int hitungLuasPermukaan27(int s27) {
        return 6 * (s27 * s27);}
    
    public static void main(String[] args) {
    Scanner andra = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        int sisi27 = andra.nextInt();
        
        int vol27 = hitungVolume27(sisi27);
        int lp27 = hitungLuasPermukaan27(sisi27);
        
        System.out.println("Volume Kubus: " + vol27);
        System.out.println("Luas Permukaan Kubus: " + lp27);
        
    }
}