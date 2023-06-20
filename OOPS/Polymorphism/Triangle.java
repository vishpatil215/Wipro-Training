public class Triangle extends Shape {


    Triangle() {
        super("Triangle");
    }
    public void draw(){
        System.out.println("Drawing Shape "+super.shape);
    }
    public void erase(){
        System.out.println("Erasing Shape "+super.shape);
    }
    
}
