package programs;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println(" Current Thread "+Thread.currentThread().getName());

    }
}

class  RunnableDemoImp {
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();
    }
}
