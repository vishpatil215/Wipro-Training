class Animal{

    public void eat(){
        System.out.println("Eat Method");
    }
     public void sleep(){
        System.out.println("Sleep Method");
    }
}
class Bird extends Animal{
     public void fly(){
        System.out.println("Fly Method");
    }
}
class Assign{
    public static void main(String[] args) {
        System.out.println("Method Call By Animal Class...");
        Animal an = new Animal();
        an.eat();
        an.sleep();
        System.out.println("Method Call By Animal Class...");
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}