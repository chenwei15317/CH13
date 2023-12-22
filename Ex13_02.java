import java.util.Scanner;

public class Ex13_02 {
    public static void main(String[] args) {
        int num = 12, den;
        Scanner sc = new Scanner(System.in);
        den = sc.nextInt();

        if (den != 0) {
            int ans = num / den;
            System.out.println("答案: " + ans);
        } else {
            System.out.println("除數為0");
        }

        sc.close();

        System.out.println("end of main()!!");
    }
}
