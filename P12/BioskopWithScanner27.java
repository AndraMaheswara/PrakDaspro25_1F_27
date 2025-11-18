package P12;

import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner andra = new Scanner(System.in);
        int pilihan27;
        
        String[][] penonton27 = new String[4][2];

        do {    
            System.out.println("Menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan27 = andra.nextInt();
            andra.nextLine();

            switch (pilihan27){
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama27 = andra.nextLine(); 

                    System.out.print("Masukkan baris (1-4): ");
                    int baris27 = andra.nextInt();

                    System.out.print("Masukkan kolom (1-2): ");
                    int kolom27 = andra.nextInt();
                    andra.nextLine();
                    
                   if (baris27 < 1 || baris27 > 4 || kolom27 < 1 || kolom27 > 2) {
                        System.out.println("Posisi kursi tidak valid! Ulangi Input");
                        continue;
                    } else if (penonton27[baris27 - 1][kolom27 - 1] != null) {
                        System.out.println("Kursi sudah terisi! Ulangi Input");
                        continue;
                    
                    }
                    break;
                    
                case 2:
                System.out.println("Daftar Penonton: ");
                    for (int i = 0; i < penonton27.length; i++) {
                        for (int j = 0; j < penonton27[i].length; j++) {
                            if (penonton27[i][j] == null) {
                                System.out.print("[ *** ] ");
                            } else {
                                System.out.print("[" + penonton27[i][j] + "] ");
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

        } while (pilihan27 != 3);
            }
}

     
    

    

