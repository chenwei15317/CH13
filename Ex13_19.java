import java.util.Scanner;

class ArgumentOutOfBoundException extends Exception {
    public ArgumentOutOfBoundException(String message) {
        super(message);
    }
}

public class Ex13_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int input = scanner.nextInt();

            if (input <= 1) {
                throw new ArgumentOutOfBoundException("請輸入大於1的整數");
            }

            boolean isPrime = prime(input);
            System.out.println(isPrime);
        } 
        
        catch (ArgumentOutOfBoundException e) {
            System.out.println("ArgumentOutOfBoundException: " + e.getMessage());
        }
        
         finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    static boolean prime(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n 必須大於1");
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
