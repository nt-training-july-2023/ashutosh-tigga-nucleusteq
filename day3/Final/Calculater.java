
import java.util.*;
public final class Calculater {
    private final double PI=3.14;
    private final String version;
    public Calculater(String version) {
        this.version = version;
    }
    
    public Calculater() {
    }

    {
        System.out.println("initializing block");
        version="ver1.1";
    }
    
    public final void sum(int num1,int num2){
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
    public final void multiplication(int num1,int num2){
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
    }
    public final void divide(int num1,int num2){
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
    }
    public final void subtraction(int num1,int num2){
        if(num1>=num2)
         System.out.println(num1+" - "+num2+" = "+(num1-num2));
         else
          System.out.println(num2+" - "+num1+" = "+(num2-num1));
    }
    public final void areaOfCirle(float radius){
        System.out.println("area Of circle ="+(PI*Math.pow(radius,2)));
    }

    @Override
    public String toString() {
        return "Calculater [PI=" + PI + ", version=" + version + "]";
    }
    

    
}
