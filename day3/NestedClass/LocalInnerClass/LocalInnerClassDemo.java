
public class LocalInnerClassDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerDisplay();
        Outer.InnerClass innerClass = out.new InnerClass();
        innerClass.display();
    }

}
