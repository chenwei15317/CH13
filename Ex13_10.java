class Test {
    static void test(int num, int den) {
        if (den == 0) {
            throw new ArithmeticException("除數不能為零");
        }
        System.out.println(num + "/" + den + "=" + num / den);
    }
}

public class Ex13_10 {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            Test.test(numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.println("捕捉到 ArithmeticException 例外: " + e.getMessage());
        }
    }
}

