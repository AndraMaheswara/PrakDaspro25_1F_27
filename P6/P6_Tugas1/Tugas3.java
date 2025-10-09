package P6.P6_Tugas1;
import java.util.Scanner;
public class Tugas3{
    

            public static void main(String[] args){
            Scanner andra = new Scanner(System.in);


                String jenisPengguna, tolak;
                int sks;
                tolak= "Akses wifi ditolak";

                System.out.print("masukkan jenis pengguna (mahasiswa/dosen): ");
                jenisPengguna = andra.nextLine();


                if (jenisPengguna.equalsIgnoreCase("dosen")){ 
                    System.out.println("akses wifi diberikan (dosen)");}
                
                else if (jenisPengguna.equalsIgnoreCase("mahasiswa")){
                    System.out.print("masukkan jumlah sks:");
                    sks = andra.nextInt();
                    if (sks>=12) {System.out.println("akses wifi diberikan (mahasiswa)");}
                    else  {System.out.println(tolak);}}
                 
                    
                    else {System.out.println(tolak);}
                















            }}