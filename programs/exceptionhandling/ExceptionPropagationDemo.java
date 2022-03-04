package programs.exceptionhandling;

public class ExceptionPropagationDemo {
    void m1(){
        int n1=50;
        int n2=0;
        System.out.println(n1/n2);
    }

    void m2(){
        m1();
    }
    void m3(){
        try{
            m2();
        }catch (ArithmeticException ae){
           ae.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ExceptionPropagationDemo obj = new ExceptionPropagationDemo();
        obj.m3();
    }
}
