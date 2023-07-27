
 interface  Person {
    String name="Ashutosh Tigga";
    void getName();
}

public class AnnoynousInnerClassDemo {
    public static void main(String[] args) {
        Person person=new Person() {
            @Override public  void getName()
            {
                System.out.println("AnnoynousInnerClass attribute name :"+name);
            }
        };
        person.getName();
    }
}
