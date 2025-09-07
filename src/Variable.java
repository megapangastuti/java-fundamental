public class Variable {
    public static void main(String[] args) {
        /*
        * 1. Definisi dari variable
        * 2. Kegunaan dari variable
        * 3. Aturan penamaan dari variable
        *   - Harus diawali huruf, _, atau $
        *   - Tidak boleh diawali angka
        *   - Tidak boleh pakai kata kunci (reserved word)
        *   - Mengikuti camelCase (contoh: jumlahMahasiswa)
        * 4. Jenis variabel dalam Java
        *   a. Local Variable
        *   b. Instance Variable (Non-Static Fields)
        *   c. Class Variable (Static Fields)
        *   d. Final Variable (Konstanta)
        *   e. Var (Inferensi Tipe) - Java 10+
        * 5. Scope Variabel
        * 6. Default Value
        * */

        // 1. Deklarasi dan Inisialisasi Variabel
        int angka; // mendeklarasikan variable tanpa menginisialisasi nilainya
        int number = 10; // mendeklarasikan sekaligus menginisialisasi suatu variable
        // System.out.println(angka); // variabel lokal harus diinisiasi dulu sebelum digunakan
        System.out.println(number);

        // 2. Jenis Variable
        // a. Local Variable
        // b. Instance Variable (Non-Static Fields)
        // c. Class Variable (Static Fields)
        // d. Final Variable (Konstanta)
        final double PI = 3.14159;
        System.out.println("Nilai PI: " + PI);

        // Format Specifier
        final int panjang = 30;
        System.out.printf("Panjang ruangannya adalah %d cm", panjang);
        // e. Var (Inferensi Tipe) - Java 10+
    }
}
