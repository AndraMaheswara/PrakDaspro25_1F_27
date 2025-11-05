package P10;


import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int n27 = andra.nextInt();

        if (n27 < 3) {
            System.out.println("n minimal 3");
        } else {
            for (int i27 = 1; i27 <= n27; i27++) {
                for (int j27 = 1; j27 <= n27; j27++) {
                    if (i27 == 1 || i27 == n27 || j27 == 1 || j27 == n27) {
                        System.out.print(n27 + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

      
    }
}