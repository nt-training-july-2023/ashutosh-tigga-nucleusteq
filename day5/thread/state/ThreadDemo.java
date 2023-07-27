
public class ThreadDemo extends Thread{
  public static  synchronized void commonResource(){
      try {
        Thread.sleep(4000);
      } catch (Exception e) {
        // TODO: handle exception
      }
  }
    public void run(){
       Thread thread=Thread.currentThread();
      //   System.out.println(" Threading is");
      //   System.out.println(thread.getState());
      commonResource();
      System.out.println(thread.getName()+" having state "+thread.getState());
    }

    public static void main(String[] args) {
        ThreadDemo thread1=new ThreadDemo();
         ThreadDemo thread2=new ThreadDemo();
        System.out.println(" thread object is created ");
        System.out.println(thread1.getName()+" is "+thread1.getState());
        System.out.println(thread2.getName()+" is "+thread2.getState());
        System.out.println(" execute thread ");
        thread1.start();
        thread2.start();
        System.out.println(thread1.getName()+" is "+thread1.getState());
        System.out.println(thread2.getName()+" is "+thread2.getState());
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(thread1.getName()+" is "+thread1.getState());
        System.out.println(thread2.getName()+" is "+thread2.getState());
       try {
         thread2.join();
       } catch (Exception e) {
        // TODO: handle exception
       }
         System.out.println(thread1.getName()+" is "+thread1.getState());
        System.out.println(thread2.getName()+" is "+thread2.getState());
       
    }
}


