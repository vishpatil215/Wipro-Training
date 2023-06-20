public class Square extends Shape {

    Square() {
        super("Square");
        //TODO Auto-generated constructor stub
    }
    public void draw(){
        System.out.println("Drawing Shape "+super.shape);
    }
    public void erase(){
        System.out.println("Erasing Shape "+super.shape);
    }
    
}
