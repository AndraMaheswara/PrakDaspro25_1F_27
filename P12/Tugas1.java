package P12;

import java.util.Scanner;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        int[][] hasil_survey27 = new int[10][6];
        int responden27 = 0;

        while (responden27 < 10) {
        int pertanyaan27 = 0;

        while (pertanyaan27 < 6) {
        System.out.print("Masukkan nilai (1-5) untuk responden " + (responden27 + 1) + ", pertanyaan " + (pertanyaan27 + 1) + ": ");
        int nilai27 = andra.nextInt();

        hasil_survey27[responden27][pertanyaan27] = nilai27;

        pertanyaan27 = pertanyaan27 + 1;
        }

        responden27 = responden27 + 1;
        }

        System.out.println("Selesai menyimpan data");
    }
}
