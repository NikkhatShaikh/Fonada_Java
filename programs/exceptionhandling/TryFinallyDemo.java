package programs.exceptionhandling;

public class TryFinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }finally {
            System.out.println(" I am In finally block");
            int a= 10; int b=20;
            int c = a+b;
            System.out.println(" addition of a+b= "+c);
        }
        System.out.println(" Remaining Code will be executing ");
        System.out.println(10);
        System.out.println(100);
        System.out.println(10000);
    }
}
