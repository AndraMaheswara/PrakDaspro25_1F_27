package P12;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        int[][] nilai27 = new int[10][6];
        int total_semua27 = 0;
        int responden27 = 0;

        while (responden27 < 10) {
            int pertanyaan27 = 0;

        while (pertanyaan27 < 6) {
        System.out.print("Masukkan nilai untuk responden " + (responden27 + 1) + ", pertanyaan " + (pertanyaan27 + 1) + ": ");
        nilai27[responden27][pertanyaan27] = andra.nextInt();
        total_semua27 = total_semua27 + nilai27[responden27][pertanyaan27];
        pertanyaan27 = pertanyaan27 + 1;
        }

        responden27 = responden27 + 1;
        }

        int rata_total27 = total_semua27 / 60;
        System.out.println("Rata-rata keseluruhan: " + rata_total27);
        }
}
