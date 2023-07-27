
public class Child extends Parent {
    private String name;
    
    public Child(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeHouse(){
        System.out.println(" Dream of "+super.getName()+" of having a big house is fullfilled by Child "+this.name);
    }

    public void becomeBillionaire(){
        System.out.println("Dream of "+super.getName()+" become billionaire is fullfilled by child "+this.name);
    }

    public static void main(String args[]){
        Parent parent =new Child("ABC");
        Child child =new Child("ABC");
        child.setName("XYZ");
        parent.eat();
        parent.talk();
        child.becomeBillionaire();
        child.makeHouse();
    }
}
