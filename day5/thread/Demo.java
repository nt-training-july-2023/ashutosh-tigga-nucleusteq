interface Add{
    public void solve();
}

class Demo{
    public static void main(String[] args) {
        Add add=new Add(){
            @Override
            public void solve(){
                System.out.println("adding");
            }
        };
        add.solve();
        
        Runnable thread=new Runnable() {
            @Override
            public void run(){
                System.out.println("abcd");
            }
        };
        thread.run();
    }
}