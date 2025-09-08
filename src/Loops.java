public class Loops {
    public static void main(String[] args) {
        // 1. For loops
        // a. Bentuk dasar
        /* for (inisialisasi; kondisi; update) {
            // blok kode
        } */

        // b. contoh sederhana
        for (int i = 0; i < 5; i++) {
            System.out.println("Iterasi ke-" + i);
        }

        // 2. While loops
        // a. Bentuk dasar
        /* while (kondisi) {
            // blok kode
        } */

        // b. contoh sederhana
        int i = 0;
        while (i < 5) {
            System.out.println("Iterasi ke-" + i);
            i++;
        }

        // 3. Do-while loops
        // a. Bentuk dasar
        /* do {
            // blok kode
        } while (kondisi);  */

        // b. contoh sederhana
        int j = 0;
        do {
            System.out.println("Iterasi ke-" + j);
            j++;
        } while (j < 5);
    }
}
