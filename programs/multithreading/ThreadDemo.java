package programs.multithreading;

public class ThreadDemo extends  Thread{
    @Override
    public void run() {
        System.out.println("Current Thread"+Thread.currentThread().getName());
    }
}
class ThreadDemoImp{
    public static void main(String[] args) {
        ThreadDemo threadDemo=new ThreadDemo(); // New Born Thread
        threadDemo.start(); // runnable
    }
}