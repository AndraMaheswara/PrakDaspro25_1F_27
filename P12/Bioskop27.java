package P12;

public class Bioskop27 {
    public static void main(String[] args) {
      
        String[][] penonton27 = new String[4][2];
        
      
        penonton27[0][0] = "Amin";
        penonton27[0][1] = "Bena";
        penonton27[1][0] = "Candra";
        penonton27[1][1] = "Dela";
        penonton27[2][0] = "Eka";
        penonton27[2][1] = "Farhan";
        penonton27[3][0] = "Gisel";
        penonton27[3][0] = "Hana";
         

        System.out.println(penonton27.length);
        for (int i = 0; i < penonton27.length; i++) {
            System.out.println("Panjang baris ke-" +(i+1)+": " +penonton27[i].length);
        }
       
       
        System.out.printf("%s\t%s\n", penonton27[0][0], penonton27[0][1]);
        System.out.printf("%s\t%s\n", penonton27[1][0], penonton27[1][1]);
        System.out.printf("%s\t%s\n", penonton27[2][0], penonton27[2][1]);
        System.out.printf("%s\t%s\n", penonton27[3][0], penonton27[3][1]);
    }
}
