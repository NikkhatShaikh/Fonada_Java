package programs.exceptionhandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        int n1=50;
        int n2=0;
        String s = null;

        int a[]={10,20,30,40};

        try{
            System.out.println(a[10]);
            System.out.println(n1/n2);
            System.out.println(s.length());

        }catch (NullPointerException ne){
            System.out.println(ne);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(" Remaining Code");
    }
}
