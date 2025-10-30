package P10;

import java.util.Scanner;

public class Square27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n27 = andra.nextInt();

        for (int iOuter27 = 1; iOuter27 <= n27; iOuter27++) {
            for (int i27 = 1; i27 <= n27; i27++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
