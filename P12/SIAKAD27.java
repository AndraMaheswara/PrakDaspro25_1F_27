package P12;
import java.util.Scanner;

public class SIAKAD27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);
            System.out.print("Masukkan jumlah siswa: ");
            int jumlahSiswa27 = andra.nextInt();

            System.out.print("Masukkan jumlah mata kuliah: ");
            int jumlahMatkul27 = andra.nextInt();
            
            int[][] nilai27 = new int[jumlahSiswa27][jumlahMatkul27];

            for (int i = 0; i < jumlahSiswa27; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa27 = 0;

            for (int j = 0; j < jumlahMatkul27; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai27[i][j] = andra.nextInt();
                totalPerSiswa27 += nilai27[i][j];
            }

                System.out.println("Nilai rata-rata: " + totalPerSiswa27 / jumlahMatkul27);
            }
            System.out.println("\n=============================");
            System.out.println("Rata-rata Nilai Setiap mata kuliah: ");

            for (int j = 0; j < 3; j++) {
                double totalPerMatkul27 =0;

                for (int i = 0; i < 4; i++) {
                    totalPerMatkul27 += nilai27[i][j];
                    
                }
                System.out.println("Mata kuliah " + (j+1)+": " +totalPerMatkul27/jumlahSiswa27);
            }
        
    }
}
