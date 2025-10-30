package P10;

import java.util.Scanner;

public class NilaiKelompok27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        int kelompok27 = 1;
        while (kelompok27 <= 6) {
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
            kelompok27++;
        }
    }
}
