
import java.util.Scanner;
public class CM_Siakad_27{
    
            public static void main(String[] args){
            Scanner andra = new Scanner(System.in);

          

            System.out.println("===== INPUT DATA MAHASISWA =====");
            System.out.print("Nama:");
            String nama27 = andra.nextLine();
            System.out.print("NIM:");
            long nim27 = andra.nextLong();

            System.out.println("Masukkan Nilai Angka (0-100):");
            System.out.print("Pancasila:");
            int nilaiPanca27 = andra.nextInt();
            System.out.print("DasarPemrograman:");
            int nilaiDaspro27 = andra.nextInt();
            System.out.print("Bahasa Inggris:");
            int nilaiBing27 = andra.nextInt();

            if (nilaiPanca27> 100|| nilaiBing27 > 100||nilaiDaspro27 > 100) {
                System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100.");
                System.exit(0);}

            else if (nilaiPanca27< 0|| nilaiBing27 < 0||nilaiDaspro27 < 0) {
                System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100.");
                System.exit(0);}

            int sksPanca27, sksDaspro27, sksBing27, sksTotal27;
            sksBing27=2;
            sksDaspro27=3;
            sksPanca27=2;
            sksTotal27=7;
            
            String ratingPanca27=null, ratingDaspro27=null, ratingBing27=null;

            //konversi nilai
             if     (nilaiPanca27 > 80 && nilaiPanca27 <= 100)  { ratingPanca27="A";} 
            else if (nilaiPanca27 > 73 && nilaiPanca27 <= 80)   { ratingPanca27="B+";}
            else if (nilaiPanca27 > 65 && nilaiPanca27 <= 73)   { ratingPanca27="B";}
            else if (nilaiPanca27 > 60 && nilaiPanca27 <= 65)   { ratingPanca27="C+";}
            else if (nilaiPanca27 > 50 && nilaiPanca27 <= 60)   { ratingPanca27="C";}
            else if (nilaiPanca27 > 39 && nilaiPanca27 <= 50)   { ratingPanca27="D";}
            else if (nilaiPanca27 <= 39){ ratingPanca27="E";}

            if      (nilaiDaspro27 > 80 && nilaiDaspro27 <= 100){ ratingDaspro27="A";} 
            else if (nilaiDaspro27 > 73 && nilaiDaspro27 <= 80) { ratingDaspro27="B+";}
            else if (nilaiDaspro27 > 65 && nilaiDaspro27 <= 73) { ratingDaspro27="B";}
            else if (nilaiDaspro27 > 60 && nilaiDaspro27 <= 65) { ratingDaspro27="C+";}
            else if (nilaiDaspro27 > 50 && nilaiDaspro27 <= 60) { ratingDaspro27="C";}
            else if (nilaiDaspro27 > 39 && nilaiDaspro27 <= 50) { ratingDaspro27="D";}
            else if (nilaiDaspro27 <= 39)                       { ratingDaspro27="E";}

            if      (nilaiBing27 > 80 && nilaiBing27 <= 100)    { ratingBing27="A";} 
            else if (nilaiBing27 > 73 && nilaiBing27 <= 80)     { ratingBing27="B+";}
            else if (nilaiBing27 > 65 && nilaiBing27 <= 73)     { ratingBing27="B";}
            else if (nilaiBing27 > 60 && nilaiBing27 <= 65)     { ratingBing27="C+";}
            else if (nilaiBing27 > 50 && nilaiBing27 <= 60)     { ratingBing27="C";}
            else if (nilaiBing27 > 39 && nilaiBing27 <= 50)     { ratingBing27="D";}
            else if (nilaiBing27<= 39){ ratingBing27="E";}

            double nsPanca27=0, nsDaspro27=0, nsBing27=0;
            
            // konversi nilai stara
            if      (nilaiPanca27 > 80 && nilaiPanca27 <= 100)  { nsPanca27=4;} 
            else if (nilaiPanca27 > 73 && nilaiPanca27 <= 80)   { nsPanca27=3.5;}
            else if (nilaiPanca27 > 65 && nilaiPanca27 <= 73)   { nsPanca27=3;}
            else if (nilaiPanca27 > 60 && nilaiPanca27 <= 65)   { nsPanca27=2.5;}
            else if (nilaiPanca27 > 50 && nilaiPanca27 <= 60)   { nsPanca27=2;}
            else if (nilaiPanca27 > 39 && nilaiPanca27 <= 50)   { nsPanca27=1;}
            else if (nilaiPanca27 <= 39)                        { nsPanca27=0;}

            if      (nilaiDaspro27 > 80 && nilaiDaspro27 <= 100){ nsDaspro27=4;} 
            else if (nilaiDaspro27 > 73 && nilaiDaspro27 <= 80) { nsDaspro27=3.5;}
            else if (nilaiDaspro27 > 65 && nilaiDaspro27 <= 73) { nsDaspro27=3;}
            else if (nilaiDaspro27 > 60 && nilaiDaspro27 <= 65) { nsDaspro27=2.5;}
            else if (nilaiDaspro27 > 50 && nilaiDaspro27 <= 60) { nsDaspro27=2;}
            else if (nilaiDaspro27 > 39 && nilaiDaspro27 <= 50) { nsDaspro27=1;}
            else if (nilaiDaspro27 <= 39)                       { nsDaspro27=0;}

            if      (nilaiBing27 > 80 && nilaiBing27 <= 100)    { nsBing27=4;} 
            else if (nilaiBing27 > 73 && nilaiBing27 <= 80)     { nsBing27=3.5;}
            else if (nilaiBing27 > 65 && nilaiBing27 <= 73)     { nsBing27=3;}
            else if (nilaiBing27 > 60 && nilaiBing27 <= 65)     { nsBing27=2.5;}
            else if (nilaiBing27 > 50 && nilaiBing27 <= 60)     { nsBing27=2;}
            else if (nilaiBing27 > 39 && nilaiBing27 <= 50)     { nsBing27=1;}
            else if (nilaiBing27<= 39)                          { nsBing27=0;}


            System.out.println("==============================================");
            System.out.println("        HASIL KONVERSI NILAI MAHASISWA        ");
            System.out.println("==============================================");
            System.out.println("Nama    :   "+nama27);
            System.out.println("NIM     :   "+nim27);
            System.out.println("______________________________________________");
            System.out.println("Mata Kuliah            SKS  Nilai   Huruf   Setara");
            System.out.println("______________________________________________");
            System.out.println(  "Pancasila              " + sksPanca27 +   "    " + nilaiPanca27 +     "       " + ratingPanca27 +   "     " + nsPanca27);
            System.out.println(  "Dasar Pemrograman      " + sksDaspro27 +  "    " + nilaiDaspro27 +    "       " + ratingDaspro27 +  "     " + nsDaspro27);
            System.out.println(  "Bahasa Inggris         " + sksBing27 +    "    " + nilaiBing27 +      "       " + ratingBing27 +    "     " + nsBing27);
            System.out.println("______________________________________________");
            System.out.println(  "Total SKS:             " +sksTotal27);
            System.out.println(  "Total Bobot:           " +(nsBing27*sksBing27+nsPanca27*sksPanca27+nsDaspro27*sksDaspro27)); //ns kali sks
            System.out.println(  "Index Prestasi(IP)     "+(nsPanca27*2+nsDaspro27*3+nsBing27*2)/sksTotal27);
            

            if ((nsPanca27*2+nsDaspro27*3+nsBing27*2)/sksTotal27<=2) {
                System.out.println("TIDAK LULUS (IP KURANG DARI 2)");}
            else if (nilaiPanca27<=50) {
                System.out.println("TIDAK LULUS (NILAI PANCASILA D/E)");}
            else if (nilaiBing27<=39) { 
                System.out.println("TIDAK LULUS (TERDAPAT NILAI E)");}
            else if (nilaiDaspro27<50) {
                System.out.println("TIDAK LULUS (TERDAPAT NILAI E)");}
            else if (nilaiPanca27<50) {
                System.out.println("TIDAK LULUS (TERDAPAT NILAI E)");}
            else {System.out.println("SELAMAT ANDA LULUS");}
                
            }}