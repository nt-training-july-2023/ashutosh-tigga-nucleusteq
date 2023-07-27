class BankThread extends Thread{
    public void run(){

    }
    public static void main(String[] args) {
        BankThread user1=new BankThread();
        BankThread user2=new BankThread();
        
        user1.start();

        user2.start();
    }
}