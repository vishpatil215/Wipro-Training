import java.util.Scanner;

public class as2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st Number:.. ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number:.. ");
        int b = sc.nextInt();
        if(a%10==b%10)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
    
}
