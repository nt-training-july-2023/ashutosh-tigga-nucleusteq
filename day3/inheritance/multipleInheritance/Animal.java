
public class Animal implements Birds,Fish,Reptiles {
    public void fly(String name){
        System.out.println(name+"is flying ");
    }
    public void swim( String name){
        System.out.println(name+" is swiming");
    }
    public void trundle( String name){
        System.out.println(name+" is trundling");
    }

    public static void main(String args[]){
      Birds birds=new Animal();
      Fish fish=new Animal();
      Reptiles reptiles=new Animal();
      birds.fly("Parrot");
      fish.swim("whale");
      reptiles.trundle("snake");
    }
}
