public class as6 {
    public static void main(String[] args) {
        char ch = 'a';
        if(Character.isAlphabetic(ch)){
            System.out.println("Alphabate");
        }
       else if(Character.isDigit(ch)){
            System.out.println("Digit");
       }
        else
            System.out.println("Special Character");
        
        
    }
    
}
