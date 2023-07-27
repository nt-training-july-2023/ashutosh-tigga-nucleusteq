import java.util.ArrayList;

public class MathOperation {
    private int num;
    
    public MathOperation(int num) {
        this.num = num;
    }
    synchronized{
    public   void reverseOfList(){
        ArrayList<Integer> rev=new ArrayList<Integer>();
        for(int i=num;i>0;i--){
           rev.add(i);
        }
        System.out.println(rev);
    }
    public synchronized  void febonacci(){
        int a=0;
        int b=1;
        int sum=0;
        System.out.println(a+" "+b);
        for(int i=2;i<=num;i++){
            sum=a+b;
            System.out.println(" "+sum);
            a=b;
            b=sum;
        }
    }

    public synchronized  void sumofList(){
        int sum=0;
        for(int i=0;i<=sum;i++){
            sum=sum+i;
        }
        System.out.println("sum is :"+sum);
    }
    
}
