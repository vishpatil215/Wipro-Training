import java.util.Scanner;

public class as15 {
    public static void main(String[] args) {
        int sum = 0, dig;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:..");
        int n = sc.nextInt();

        while (n > 0) {
            dig = n % 10;
            sum = sum + dig;
            n = n / 10;
        }

        System.out.println(sum);
        sc.close();
    }
}
