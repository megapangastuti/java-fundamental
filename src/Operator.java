public class Operator {
    public static void main(String[] args) {
        // 1. Operator Aritmatika
        int x = 10;
        int y = 3;
        int addResult = x + y;
        int multiplyResult = x * y;
        int substractionResult = x-y;
        int divisionResult = x/y;
        int modulusResult = x%y;

        System.out.println("The addition result is " + addResult);
        System.out.println("The multiple result is " + multiplyResult);
        System.out.println("The substraction result is " + substractionResult);
        System.out.println("The division result is " + divisionResult);
        System.out.println("The modulus result is " + modulusResult);

        // 2. Operator Penugasan
        // 3. Operator Perbandingan
        // 4. Operator Logika
        // 5. Operator Increment & Decrement
        // 6. Operator Bitwise
        // 7. Operator Ternary (?:)

        // 8. Operator instanceOf && Pattern Matching
        Object obj = "Hello Java";
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase()); // otomatis cast ke String
        }
    }
}
