import java.util.Scanner;

public class Ex13_03 {
    public static void main(String[] args) {
        int num = 12, den;
        Scanner sc = new Scanner(System.in);

        try {
            den = sc.nextInt();

            if (den != 0) {
                int ans = num / den;
                System.out.println("答案: " + ans);
            } else {
                System.out.println("除數為0");
            }
        } 

        catch (ArithmeticException e) {
            System.out.println("捕捉到 ArithmeticException 例外: " + e.getMessage());
        } 

        finally {
            sc.close();
            System.out.println("end of main()!!");
        }
    }
}
