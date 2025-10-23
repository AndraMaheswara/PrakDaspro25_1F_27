package P9;
import java.util.Scanner;

public class SiakadFor27 {
    public static void main(String[] args){
    Scanner andra = new Scanner(System.in);

        double nilai, tertinggi=0, terendah=100;
        int lulus=0, tidakLulus=0;

    for (int i = 1; i <= 10 ; i++){
        
        System.out.print("masukkan nilai mahasiswa ke-" + i + ":");
        nilai = andra.nextDouble();
        if (nilai>tertinggi){
            tertinggi=nilai;
        }
        if (nilai<terendah){
            terendah=nilai;
        }
        if (nilai >= 60) {
                lulus++;
        } 
        else{
                tidakLulus++;
    }
}
    System.out.println("Nilai tertinggi: " +tertinggi);
    System.out.println("Nilai terendah: " +terendah);
    System.out.println("mahasiswa lulus " +lulus);
    System.out.println("mahasiswa tidaklulus " +tidakLulus);

}}
