

public class Outer {
    private int outer_a=10;
    public static int outer_b=20;
    static class StaticNestedClass{
        private int inner_a=30;
        void display(){
            System.out.println("inner class method invoked");
            System.out.println("outer_a"+outer_b);
            Outer out=new Outer();
            System.out.println("outer_a:"+out.outer_a);
        }
    }
}
