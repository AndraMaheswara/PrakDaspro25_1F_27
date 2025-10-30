package P10;

import java.util.Scanner;

public class Tugas1_27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n27 = andra.nextInt();

        int total27 = 0;

        for (int i27 = 1; i27 <= n27; i27++) {
            int kuadrat27 = i27 * i27;
            total27 += kuadrat27;
            System.out.println(i27 + "^2 = " + kuadrat27);
        }

        System.out.println("Jumlah kuadrat dari 1 sampai " + n27 + " adalah " + total27);
    }
}

//a