import java.util.Scanner;

public class as13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:..");
        int n = sc.nextInt();
        boolean flag = false;
        sc.close();
        for(int i = 2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("Number is not prime");
        else
            System.out.println("Number is prime");
    }
    
}
