package P11;


    
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah27 = andra.nextInt();

        int[] nilaiMhs27 = new int[jumlah27];
        int total27 = 0;
        int tertinggi27, terendah27;

        for (int i = 0; i < jumlah27; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs27[i] = andra.nextInt();
            total27 += nilaiMhs27[i];
        }

        tertinggi27 = nilaiMhs27[0];
        terendah27 = nilaiMhs27[0];

        for (int i = 1; i < jumlah27; i++) {
            if (nilaiMhs27[i] > tertinggi27) {
                tertinggi27 = nilaiMhs27[i];
            }
            if (nilaiMhs27[i] < terendah27) {
                terendah27 = nilaiMhs27[i];
            }
        }

        double rata27 = (double) total27 / jumlah27;

        System.out.println("=== Hasil Pengolahan Nilai Mahasiswa ===");
        System.out.println("Nilai yang dimasukkan:");
        for (int i = 0; i < jumlah27; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs27[i]);
        }

        System.out.println("Rata-rata nilai: " + rata27);
        System.out.println("Nilai tertinggi: " + tertinggi27);
        System.out.println("Nilai terendah: " + terendah27);
    }}
//a
