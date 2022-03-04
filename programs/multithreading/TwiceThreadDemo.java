package programs.multithreading;

public class TwiceThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println(" Thread Is Running ");
        System.out.println(TwiceThreadDemo.currentThread().getName());

    }
}
class TwiceThreadImp{
    public static void main(String[] args) {
        TwiceThreadDemo twiceThreadDemo = new TwiceThreadDemo();
        twiceThreadDemo.start();
        twiceThreadDemo.start();  // throw Runtime -- illegalThreadStateException
    }
}