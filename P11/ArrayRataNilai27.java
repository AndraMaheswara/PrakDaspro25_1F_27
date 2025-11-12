package P11;

import java.util.Scanner;

public class ArrayRataNilai27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

  
        int[] nilaiMhs27 = new int[10];
        double total27 = 0;
        double rata27;
        int jumlahLulus27 = 0;
        
        

        for (int i = 0; i < nilaiMhs27.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs27[i] = andra.nextInt();
        }

        for (int i = 0; i < nilaiMhs27.length; i++) {
            total27 += nilaiMhs27[i];
            if (nilaiMhs27[i] > 70) {
                jumlahLulus27++;
            }
        }

        for (int i = 0; i < nilaiMhs27.length; i++) {
            total27 += nilaiMhs27[i];
        }

        rata27 = total27 / nilaiMhs27.length;
        System.out.println("Rata-rata nilai = " + rata27);
        System.out.println("Jumlah mahasiswa yang lulus = " + jumlahLulus27);   
    }
}