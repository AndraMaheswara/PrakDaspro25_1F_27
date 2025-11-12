package P11;

public class SearchNilai27 {
    public static void main(String[] args) {
        int[] arrNilai27 = {80,85,78,96,90,82,86};
        int key27 = 90;
        int hasil27 = -1; 

        
        for (int i = 0; i < arrNilai27.length; i++) {
            if (key27 == arrNilai27[i]) {
                hasil27 = i;
                break;
            }
        }

        System.out.println();
        if (hasil27 != -1) {
            System.out.println("Nilai " + key27 + " ketemu di indeks ke-" + hasil27);
        }
        System.out.println();
    }
}