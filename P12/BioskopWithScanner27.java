package P12;

import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);
        int pilihan;
        
        String[][] penonton = new String[4][2];



        do {    
            System.out.println("Menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = andra.nextInt();
            andra.nextLine();

            switch (pilihan){
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = andra.nextLine(); 

                    System.out.print("Masukkan baris (1-4): ");
                    int baris = andra.nextInt();

                    System.out.print("Masukkan kolom (1-2): ");
                    int kolom = andra.nextInt();
                    andra.nextLine();
                    

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Posisi kursi tidak valid!");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi!");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                        System.out.println();
                    }
                    break;
                    
                case 2:
                System.out.println("Daftar Penonton: ");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("[ - ] ");
                            } else {
                                System.out.print("[" + penonton[i][j] + "] ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                    case 3:
                    System.out.println("Dadah...");
                    System.out.println();
                    break;

                default:
                    System.out.println("Menu tidak valid!");
                    System.out.println();
            }

        } while (pilihan != 3);
            }
}

     
    

    

