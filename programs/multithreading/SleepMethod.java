package programs.multithreading;

public class SleepMethod extends Thread{
    @Override
    public void run() {
        System.out.println("Current Thread"+Thread.currentThread().getName());
        for(int i=0;i<=10;i=i+2){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }

    }
}

class SleepMethodImp{
    public static void main(String[] args) {
        SleepMethod sleepMethod = new SleepMethod();
        sleepMethod.start();
    }

}