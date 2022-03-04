package programs.exceptionhandling;

public class ThrowDemo1 {

    void m1() throws UserDefinedException {
        throw new UserDefinedException("Exception Occur");
    }

    void m2()throws UserDefinedException{
        m1();
    }

    void m3(){
        try {
            m2();
        }catch (UserDefinedException ue){
            System.out.println(ue);
            ue.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ThrowDemo1 throwDemo1 = new ThrowDemo1();
        throwDemo1.m3();
    }
}
