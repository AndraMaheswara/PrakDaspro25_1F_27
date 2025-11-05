package P10;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n27 = andra.nextInt();

        for (int i27 = 1; i27 <= n27; i27++) {
            int jumlahKuadrat27 = 0;
            System.out.print("n = " + i27 + " → jumlah kuadrat = ");
            
            for (int j27 = 1; j27 <= i27; j27++) {
                jumlahKuadrat27 += j27 * j27;
                System.out.print(j27 * j27);
                if (j27 < i27) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlahKuadrat27);
        }

       
    }
}