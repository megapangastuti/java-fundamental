public class DataType {
    public static void main(String[] args) {
        /*
        * 1. Tipe Data Primitif
        *   - Tipe data built-in atau bawaan di Java
        *   - Langsung menyimpan nilainya (bukan object)
        *   - Ukurannya dari masing-masing tipe data tetap
        *       a. byte
        *       b. short
        *       c. int
        *       d. long
        *       e. float
        *       f. double
        *       g. char
        *       h. boolean
        * 2. Tipe Data Non-Primitive
        *   - Tipe data yang dibuat dari class (termasuk class buatan programmer)
        *   - Disimpan sebagai referensi/objek (alamat memori)
        *   - Bisa punya method dan property
        *   - Nilai default adalah null kalau tidak diinisialisasi
        *   - Ukuran bervariasi karena berupa object
        * */

        // 1. Tipe Data Primitive
        byte iniByte = 128;
        System.out.println(iniByte);

        // 2. Tipe Data Non-Primitive
        String name = "Megaa";
        System.out.println(name);
    }
}
