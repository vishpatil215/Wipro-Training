import java.util.Scanner;

public class as17
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dig;
        while (n > 0) {
            dig = n % 10;
            System.out.print(dig);
            n = n / 10;
        }
        sc.close();
    }
}
