package P12;

import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = andra.nextLine();

            System.out.print("Masukkan baris: ");
            baris = andra.nextInt();

            System.out.print("Masukkan kolom: ");
            kolom = andra.nextInt();
            andra.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = andra.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }}

     
    

    

