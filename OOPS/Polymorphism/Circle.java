public class Circle extends Shape {

    Circle() {
        super("Circle");
        //TODO Auto-generated constructor stub
    }
     public void draw(){
        System.out.println("Drawing Shape "+super.shape);
    }
    public void erase(){
        System.out.println("Erasing Shape "+super.shape);
    }   
}
