package P10;

import java.util.Scanner;

public class NilaiKelompok27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        int kelompok27 = 1;
        double rataTertinggi27 = 0;
        int kelompokTertinggi27 = 0;

        while (kelompok27 <= 3) {
            System.out.println("Kelompok ke-" + kelompok27);

            double totalNilai27 = 0;
            for (int j27 = 1; j27 <= 5; j27++) {
                System.out.print("Masukkan nilai dari penilai ke-" + j27 + ": ");
                double nilai27 = andra.nextDouble();
                totalNilai27 += nilai27;
            }

            double rataNilai27 = totalNilai27 / 5;
            System.out.println("Rata-rata nilai kelompok " + kelompok27 + " = " + rataNilai27);
            System.out.println();
            

            if (rataNilai27>rataTertinggi27) {
                rataTertinggi27=rataNilai27;
                kelompokTertinggi27=kelompok27;}
                kelompok27++;

        }
        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok ke-" + kelompokTertinggi27);
        System.out.println("Dengan rata-rata nilai = " + rataTertinggi27);  
    }
}

// a