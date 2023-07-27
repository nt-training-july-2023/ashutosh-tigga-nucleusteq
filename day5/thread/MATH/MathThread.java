import java.util.Scanner;
public class MathThread extends Thread{
    private static int num;
    private void perform(){
         Thread thread=new Thread();
        System.out.println(thread.getName()+" is running ");
        MathOperation math=new MathOperation(num);
        System.out.println(" Febbonici :"+num);
        math.febonacci();
        try {
         Thread.sleep(5000);
       } catch (Exception e) {
        // TODO: handle exception
       }
        System.out.println(" sum of "+num);
        math.sumofList();
        try {
         Thread.sleep(5000);
       } catch (Exception e) {
        // TODO: handle exception
       }
        System.out.println(" reverse of below of number of "+num);
        math.reverseOfList();
        try {
         Thread.sleep(5000);
       } catch (Exception e) {
        // TODO: handle exception
       }
    }
    public void run(){
       perform();
       
      
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Thread.currentThread().getName()+" is Running ");
        System.out.println("Enter Number to find out perform mathmatics operation ");
        num=sc.nextInt();
        MathThread thread1=new MathThread();
        MathThread thread2=new MathThread();
        MathThread thread3=new MathThread();
        MathThread thread4=new MathThread();
        thread1.setName("thread1");
         thread2.setName("thread2");
          thread3.setName("thread3");
           thread4.setName("thread4");
           thread1.start();
           thread2.start();
           thread3.start();
           thread4.start();

    }
}
