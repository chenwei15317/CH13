import java.util.Scanner;

class IntegerLessThanZeroException extends Exception {
    public IntegerLessThanZeroException(String message) {
        super(message);
    }
}

class IntegerGreaterThanZeroException extends Exception {
    public IntegerGreaterThanZeroException(String message) {
        super(message);
    }
}

class IntegerEqualZeroException extends Exception {
    public IntegerEqualZeroException(String message) {
        super(message);
    }
}

public class Ex13_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            long input = getInput(scanner);
            checkNumber(input);
        } 
        
        catch (IntegerLessThanZeroException e) {
            System.out.println(e.getMessage());
        } 
        
        catch (IntegerGreaterThanZeroException e) {
            System.out.println(e.getMessage());
        }
        
        catch (IntegerEqualZeroException e) {
            System.out.println(e.getMessage());
        } 
        
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    static long getInput(Scanner scanner) {
        System.out.print("請輸入一個整數: ");
        return scanner.nextLong();
    }

    static void checkNumber(long num) throws IntegerLessThanZeroException, IntegerGreaterThanZeroException, IntegerEqualZeroException {
        if (num < 0) {
            throw new IntegerLessThanZeroException("您輸入的整數的值小於0");
        }
        
        else if (num > 0) {
            throw new IntegerGreaterThanZeroException("您輸入的整數的值大於0");
        } 
        
        else {
            throw new IntegerEqualZeroException("您輸入的整數的值等於0");
        }
    }
}
