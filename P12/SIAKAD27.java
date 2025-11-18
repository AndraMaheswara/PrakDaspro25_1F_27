package P12;
import java.util.Scanner;

public class SIAKAD27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);
            int[][] nilai27 = new int[4][3];

            for (int i = 0; i < nilai27.length; i++) {
                System.out.println("Input nilai mahasiswa ke-" + (i + 1));
                double totalPerSiswa27 = 0;

                for (int j = 0; j < nilai27[i].length; j++) {
                    System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                    nilai27[i][j] = andra.nextInt();
                    totalPerSiswa27 += nilai27[i][j];
                }

                System.out.println("Nilai rata-rata: " + totalPerSiswa27 / 3);
            }
            System.out.println("\n=============================");
            System.out.println("Rata-rata Nilai Setiap mata kuliah: ");

            for (int j = 0; j < 3; j++) {
                double totalPerMatkul27 =0;

                for (int i = 0; i < 4; i++) {
                    totalPerMatkul27 += nilai27[i][j];
                    
                }
                System.out.println("Mata kuliah " + (j+1)+": " +totalPerMatkul27/4);
            }
        
    }
}
