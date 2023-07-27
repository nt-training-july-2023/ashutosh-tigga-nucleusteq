public class ImpleThread implements Runnable {
    public void run(){
        Thread thread=Thread.currentThread();
       
        System.out.println(thread.getId()+" name :"+thread.getName());
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" running first ");
        Runnable r=new ImpleThread();
        Thread thread1=new Thread(r, "thread2");
        thread1.start();
        Runnable r2=new ImpleThread();
        Thread thread2=new Thread(r2,"thread3");
        thread2.start();
        Runnable r3=new ImpleThread();
        Thread thread3=new Thread(r3,"thread4");
        thread3.start();
    }
}
