package P6.P6_Tugas1;
import java.util.Scanner;
public class nestedUjianSkripsi27 {
    
    public static void main(String[] args){

        Scanner andra = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak)");
        String bebasKompen = andra.nextLine().trim();


        System.out.print("masukan jumlah log bimbingan pembimbing1: ");
        int bimbinganP1 = andra.nextInt();
         System.out.print("masukan jumlah log bimbingan pembimbing2: ");
        int bimbinganP2 = andra.nextInt();

            if (bebasKompen.equalsIgnoreCase("Ya")) {
            
            if (bimbinganP1 >=8 && bimbinganP2 >=4){
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4){
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8 ) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";

            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
            } else {
                pesan= "Gagal! Mahasiswa masih memiliki tanggungan kompen";
            }
            System.out.println(pesan);













        }























}
