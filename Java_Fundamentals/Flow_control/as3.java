import java.util.Scanner;

public class as3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number:..");
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        sc.close(); 
    }
    
}
