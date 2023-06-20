import java.util.Scanner;

public class as18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        int temp = n;
        int dig, res = 0;
        while (n > 0) {
            dig = n % 10;
            res = (res * 10) + dig;
            n = n / 10;
        }

        if (temp == res) {
            System.out.println(args[0] + " is a Palindrome");
        } else {
            System.out.println(args[0] + " is Not a Palindrome");
        }
        sc.close();
    }
}
