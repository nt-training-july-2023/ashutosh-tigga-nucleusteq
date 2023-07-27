
public class Resources {
   void read(Thread thread){
         try {
            Thread.sleep(1500);
             System.out.println(thread.currentThread().getName()+" is Reading Hi there i am a java full stack developer ");
        } catch (Exception e) {
            // TODO: handle exception
        }
       
       
    }
}
