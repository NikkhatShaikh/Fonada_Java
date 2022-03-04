package programs.exceptionhandling;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println(" Enter Two Integer No ");
            int no1 = scanner.nextInt();
            int no2 = scanner.nextInt();

            try {
                System.out.println(no1 / no2);
            } catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println(" User not suppose to divide by 0");
                no2 = 5;
                System.out.println(no1 / no2);
            }
            System.out.println("Remaining Code ");
            System.out.println(" Do You Want to Continue Enter (y/n)");
            choice=scanner.next().charAt(0);


        }while (choice=='Y'||choice=='y');
    }
}
