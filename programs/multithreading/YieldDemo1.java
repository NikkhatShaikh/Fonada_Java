package programs.multithreading;

public class YieldDemo1 extends  Thread{
    @Override
    public void run() {
        for(int i=1;i<=50;i++){
            Thread.yield();
            System.out.println(" Thread1 is Running");
        }
    }
}

class YieldDemo2 extends Thread{
    @Override
    public void run() {
        for (int j=1;j<=10;j++){
            System.out.println(" Thread2 is Running");
        }
    }
}

class YieldDemoImp{
    public static void main(String[] args) {
        YieldDemo1 yieldDemo1 = new YieldDemo1();
        YieldDemo2 yieldDemo2 = new YieldDemo2();

        yieldDemo1.start();
        yieldDemo2.start();
    }

}