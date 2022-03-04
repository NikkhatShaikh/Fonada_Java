package programs.exceptionhandling;

public class NullPointerDemo {
    public static void main(String[] args) {
        String  str = null;
        try{
            System.out.println(str.length());
        }catch (NullPointerException np){
           System.out.println(np);
           System.out.println(np.getMessage());
            np.getStackTrace();
        }
        System.out.println(" Remaining Code will be executing ");
    }
}
