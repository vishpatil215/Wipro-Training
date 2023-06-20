public class Shape {
    String shape;
    Shape(String shape){
        this.shape=shape;
    }
    public void draw(){
        System.out.println("Drawing Shape "+shape);
    }
    public void erase(){
        System.out.println("Erasing Shape "+shape);
    }
    
}
