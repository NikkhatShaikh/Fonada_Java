package programs.exceptionhandling;

public class FinallyDemo {
    public static void main(String[] args) {
        int n1 =10;
        int n2 =0;
        try {
            System.out.println(n1/n2);
        }finally {        // finally, block always execute
            System.out.println(" I am in finally block");
            System.out.println(10+20);
            System.out.println("Shaikh NikkhatParvin Gulab");
        }
        System.out.println(" Remaining code will not  be executing");
        System.out.println("Shaikh");
        System.out.println("Nikkhat");
        System.out.println("Gulab");
    }
}
