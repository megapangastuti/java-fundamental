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
        // a. byte
        byte iniByte = 127;
        System.out.println(iniByte);

        // b. short
        short iniShort = 128;
        System.out.println((byte) iniShort);

        // c. int

        // d. long
        long iniLong = 100000;
        System.out.println(iniLong);

        long iniLong2 = 2_000_000;
        System.out.println(iniLong2);

        long iniLong3 = 3_000_000_000L;
        System.out.println(iniLong3);

        // e. float & double
        float f = 1.123456789f;   // notice ada 'f' di akhir
        double d = 1.123456789;

        System.out.println("Float  : " + f);
        System.out.println("Double : " + d);

        // f. char
        char hurufDepan = 'a';
        System.out.println(hurufDepan);

        // g. boolean
        boolean iniBoolean = true;
        System.out.println(iniBoolean);

        // 2. Tipe Data Non-Primitive
        // 1. String
        String name = "Megaa";
        System.out.println(name);
        System.out.println(name.toUpperCase());

        // 3. Check tipe data
        System.out.println(((Object) iniByte).getClass().getSimpleName());   // Integer
        System.out.println(((Object) iniShort).getClass().getSimpleName()); // Double
        System.out.println(((Object) iniLong).getClass().getSimpleName());  // Boolean

        // Karena String adalah tipe data non primitive jadi memiliki method, salah satunya method getClass()
        String teks = "Halo";
        System.out.println("getClass()         : " + teks.getClass());
        System.out.println("getName()          : " + teks.getClass().getName());
        System.out.println("getCanonicalName() : " + teks.getClass().getCanonicalName());
        System.out.println("getSimpleName()    : " + teks.getClass().getSimpleName());
    }
}
