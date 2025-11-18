package P12;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        int[][] nilai27 = new int[10][6];
        int pertanyaan27 = 0;

        while (pertanyaan27 < 6) {
        int total27 = 0;
        int responden27 = 0;

        while (responden27 < 10) {
        System.out.print("Masukkan nilai untuk pertanyaan " + (pertanyaan27 + 1) + ", responden " + (responden27 + 1) + ": ");
        nilai27[responden27][pertanyaan27] = andra.nextInt();
        total27 = total27 + nilai27[responden27][pertanyaan27];
        responden27 = responden27 + 1;
         }

        int rata27 = total27 / 10;
        System.out.println("Rata-rata pertanyaan " + (pertanyaan27 + 1) + " = " + rata27);

            pertanyaan27 = pertanyaan27 + 1;
        }
    }
}
