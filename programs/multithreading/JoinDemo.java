package programs.multithreading;

public class JoinDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is started " + Thread.currentThread().getName() + Thread.currentThread().isAlive());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException Ie){

            System.out.println(Ie);
            Ie.printStackTrace();

        }
        System.out.println("Thread Terminated"+Thread.currentThread().getName());
    }
}
class  JoinDemoImp{
    public static void main(String[] args) throws InterruptedException {

        JoinDemo joinDemo1= new JoinDemo();
        JoinDemo joinDemo2= new JoinDemo();
        JoinDemo joinDemo3 = new JoinDemo();
        JoinDemo joinDemo4 = new JoinDemo();

        Thread thread1 = new Thread(joinDemo1);
        Thread thread2 = new Thread(joinDemo2);
        Thread thread3 = new Thread(joinDemo3);
        Thread thread4 = new Thread(joinDemo4);

         // main thread will pause
        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        thread3.start();
        thread3.join();

        thread4.start();
        thread4.join();

        System.out.println(" All Threads are completes its Executions ");
    }

}
