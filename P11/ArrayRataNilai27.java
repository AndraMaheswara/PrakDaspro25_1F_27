package P11;

import java.util.Scanner;

public class ArrayRataNilai27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        System.out.print("masukkan jumlah mahasiswa: ");
        int jumlahMhs27=andra.nextInt(); 
       
        int[] nilaiMhs27 = new int[jumlahMhs27];
        
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

        

        rata27 = total27 / nilaiMhs27.length;
        System.out.println("Rata-rata nilai = " + rata27);
        System.out.println("Jumlah mahasiswa yang lulus = " + jumlahLulus27);   
    }
}