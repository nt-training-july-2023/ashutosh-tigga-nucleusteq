public abstract class Parent {
    private String name;
    
    public Parent(String name) {
        this.name = name;
    }
    public void talk(){
        System.out.println(name+" is talking");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void walk(){
        System.out.println(name+" is walking ");
    }
    public void eat(){
        System.out.println(name+" is eating ");
    }

    public abstract void becomeBillionaire();

    public abstract void makeHouse();
}
