package programs.exceptionhandling;

public class UserDefinedException extends Exception {

    UserDefinedException(String message){
        super(message);
    }
}
class TestThrow{
    public static void main(String[] args) {
        try{
            throw new UserDefinedException("User Defined Exception");
        }catch (UserDefinedException ue){
            ue.printStackTrace();
            System.out.println(ue);
        }
        System.out.println(" Remaining Code is executing ");
    }
}