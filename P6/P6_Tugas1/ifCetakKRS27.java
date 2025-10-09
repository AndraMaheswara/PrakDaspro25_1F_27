package P6.P6_Tugas1;
import java.util.Scanner;
public class ifCetakKRS27 {

        public static void main(String[] args){
        Scanner andra = new Scanner(System.in);

        System.out.println("---Cetak KRS Siakad---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas27 = andra.nextBoolean();
        String pesan;

        pesan = (uktLunas27)? "Pembayaran UKT erverifikasi. Silahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
        }

        
        











                











        
}