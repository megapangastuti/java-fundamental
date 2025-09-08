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
        int totalScore;
        totalScore = 89;
        System.out.println("total score is "+ totalScore);

        totalScore += 5;
        System.out.println("total score is "+ totalScore);

        // 3. Operator Perbandingan
        String scoreString = "89";
        boolean isDifferent = 6 >= '5';
        System.out.println(isDifferent);

        // 4. Operator Logika
        // untuk case primitive data type
        int uasScore = 75;
        int attandace = 100;
        boolean isUasPassed = uasScore >= 75;
        boolean isAttandancePassed = attandace >= 75;
        boolean isPassed = isUasPassed && isAttandancePassed;
        System.out.println(isPassed);

        // untuk case non-primitive data type
        String inputUsername = "admin";
        String inputPassword = "admin123";

        Boolean cekUsername = inputUsername.equals("admin");
        Boolean cekPassword = inputPassword.equals("admin123");

        Boolean loginIsSuccess = cekUsername && cekPassword;

        System.out.println(loginIsSuccess);

        // 5. Operator Increment & Decrement
        byte z = 10;
        z++;
        System.out.println(z);

        // 6. Operator Bitwise
        System.out.println(5&3);

        // 7. Operator Ternary (?:)
        int a = ( 5 > 3 ) ? 10 : 7 ;
        System.out.println(a);

        // 8. Operator instanceOf && Pattern Matching
        Object obj = "Hello Java";
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase()); // otomatis cast ke String
        }
    }
}
