
public class ThreadDemo extends Thread {
    public void run() {
        Thread thread = new Thread();
        System.out.print(thread.getName()+" ");
        System.out.println("Thread is running  and its priority is:"+thread.getPriority()+" and id:"+thread.getId());

    }

    public static void main(String[] args) {
        ThreadDemo obj1 = new ThreadDemo();
        ThreadDemo obj2 = new ThreadDemo();
        ThreadDemo obj3 = new ThreadDemo();
        ThreadDemo obj4 = new ThreadDemo();
        Thread thread = new Thread("Main");
        System.out.println(thread.getName() + " is running");
        obj1.setName("thread1");
        obj2.setName("thread2");
        obj3.setName("thread3");
        obj4.setName("thread4");
        obj1.setPriority(1);
        obj2.setPriority(2);
        obj3.setPriority(3);
        obj4.setPriority(4);
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();

    }
}
