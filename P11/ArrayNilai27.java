package P11;

import java.util.Scanner;

public class ArrayNilai27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        int[] nilaiAkhir27 = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir27[i] = andra.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir27[i]);
        }

    }
}
    

