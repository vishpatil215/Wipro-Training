public class Orange extends Fruit {

    Orange(String name, String taste) {
        super(name, taste);
        
    }
    public void eat(){
        System.out.println("Orange Class Method");
        System.out.println("name = "+super.name);
        System.out.println("taste = "+super.taste);
    }
    
}
