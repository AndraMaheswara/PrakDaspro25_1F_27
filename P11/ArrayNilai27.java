package P11;

import java.util.Scanner;

public class ArrayNilai27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        int[] nilaiAkhir27 = new int[10];

        for (int i = 0; i < nilaiAkhir27.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir27[i] = andra.nextInt();
        }


        for (int i = 0; i < nilaiAkhir27.length; i++) {
            if (nilaiAkhir27[i] > 70) {
                    System.out.println ("Mahasiswa ke-"+i+" lulus!") ;}
         


        }

    }
}
    

