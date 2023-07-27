
public class Demo {

    int a=1;
    int b=2;
    static int c=3;
    static int d=4;

    public void showNonStaticVar(){
        System.out.println("access instance var inside instance method");
        System.out.println("a :"+a+" b:"+b);
    }
     public void showStaticVar(){
        System.out.println("access static var inside instance method");
        System.out.println("c :"+c+" d:"+d);
    }

    public static void showNonStaticMethod(){
        //System.out.println("Trying to access non static var inside Non static method ");
      //  System.out.println("a :"+a+" b:"+b);
      System.out.println("access static var inside static var");
      System.out.println("c:"+c+" d: "+d);
    }


    public static void main(String[] args) {
       Demo obj=new Demo();
       obj.showNonStaticVar();
       obj.showStaticVar();
       obj.showNonStaticMethod();
    }
}
