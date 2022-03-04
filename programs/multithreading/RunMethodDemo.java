package programs.multithreading;

public class RunMethodDemo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
class RunMethodDemoImp {
    public static void main(String[] args) {
        RunMethodDemo demo = new RunMethodDemo();
         Thread thread = new Thread(demo);
        // demo.run();
         thread.run();
         thread.start();
         thread.getId();
         thread.getState();
         thread.isAlive();

         //thread.getPriority(10);
      //  demo.stop();  stop - when stop()- method is called / thread is executed complete.
    }
}
