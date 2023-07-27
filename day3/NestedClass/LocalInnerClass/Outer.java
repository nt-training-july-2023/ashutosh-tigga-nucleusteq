
public class Outer {
    private int a=20;

    private static int b=39;

    public void outerDisplay(){
        System.out.println("outer Class method invoked");
        System.out.println("outer class a"+a);
        System.out.println("outer class b"+b);
    }
    class InnerClass{
        private int b=30;
        void display(){
            System.out.println("Inner class method invoked");
            System.out.println(" a in inner class"+a);
            System.out.println("b in inner class"+b);
        }
    }
}
