class Fruit{
    String name,taste,size;
    Fruit(String name,String taste)
    {
        this.taste=taste;
        this.name=name;
    }
    public void eat(){
        System.out.println("name= "+name);
        System.out.println("taste = "+taste);
    }
}