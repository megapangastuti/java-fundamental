public class TypeConversion {
    public static void main(String[] args) {
        // 1. Widening Casting (Konversi lebar / otomastis)
        int myInt = 10;
        double myDouble = myInt; // otomatis : int -> double

        System.out.println("Nilai int: " + myInt);
        System.out.println("Nilai double: " + myDouble);

        // 2. Narrowing Casting (Konversi Sempit / Manual)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // konversi secara manual: double -> int

        // ketika melakukan konversi secara manual, ada kemungkinan terjadi overflow
        int big = 130;
        byte small = (byte) big; // manual: int -> byte
        System.out.println(small); // -126 (karena kapasitas byte hanya -128 s/d 127)

        // 3. Real-Life Example
        int maxScore = 20;
        int traineeScore = 17;

        double finalScore = traineeScore / maxScore *100.0d;

        System.out.println("Trainee's final score is " + finalScore);
        System.out.println(((Object) (traineeScore / maxScore)).getClass().getSimpleName());

    }
}
