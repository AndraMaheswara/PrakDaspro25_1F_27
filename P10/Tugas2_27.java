package P10;

import java.util.Scanner;

public class Tugas2_27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3) = ");
        int n27 = andra.nextInt();

        if (n27 < 3) {
            System.out.println("Nilai n minimal 3!");
            return;
        }

        for (int i27 = 1; i27 <= n27; i27++) {
            for (int j27 = 1; j27 <= n27; j27++) {
                System.out.print(j27 + " ");
            }
            System.out.println();
        }
    }
}
