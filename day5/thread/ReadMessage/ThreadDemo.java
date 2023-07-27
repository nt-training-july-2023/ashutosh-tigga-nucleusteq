

public class ThreadDemo extends Thread {

    public void run(){
        Thread thread =new Thread();
        synchronized(thread){
        Resources r=new Resources();
        r.read(thread);
       }
    }
    public static void main(String[] args) {
            ThreadDemo thread1=new ThreadDemo();
            ThreadDemo thread2=new ThreadDemo();
            ThreadDemo thread3=new ThreadDemo();
            thread1.setPriority(1);
            thread2.setPriority(2);
            thread3.setPriority(3);
            thread1.setName("thread1");
            thread2.setName("thread2");
            thread3.setName("thread3");
            thread1.start();
           
            thread2.start();
        
            thread3.start();

    }
}
