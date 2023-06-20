import java.util.Scanner;

public class as9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Color code ");
        char colr = sc.next().charAt(0);
        sc.close();
        switch(colr)
        {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Red");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default :
                System.out.println("Enter valid input");
                break;

        }
    }
    
}
