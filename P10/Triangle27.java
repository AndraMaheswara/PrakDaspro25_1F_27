package P10;

import java.util.Scanner;

public class Triangle27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n27 = andra.nextInt();

        int i27 = 1;
        while (i27 <= n27) {
            int j27 = 1;
            while (j27 <= i27) {
                System.out.print("*");
                j27++;
            }
            System.out.println();
            i27++;
        }
    }
}

//a