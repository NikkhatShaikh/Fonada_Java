package programs.exceptionhandling;

import java.util.Scanner;

public class Vote {
    char choice;
    Scanner scanner = new Scanner(System.in);


    void checkAgeCriteria(int age) {
        if (age < 18) {
            throw new ArithmeticException("Sorry !!! You are Not Eligible For Voting");
        } else {
            System.out.println(" You are Eligible for vote ");
        }

    }

    public static void main(String[] args) {
        Vote vote = new Vote();  // create object using new keyword
        vote.checkAgeCriteria(17);
        System.out.println("Remaining Code ");

    }
}



