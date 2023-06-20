public class Apple extends Fruit {

    Apple(String name, String taste) {
        super(name, taste);
        
    }
    public void eat(){
        System.out.println("Apple Class Method");
        System.out.println("name = "+super.name);
        System.out.println("taste = "+super.taste);
    }

    
}
