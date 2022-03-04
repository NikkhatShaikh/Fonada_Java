package programs.exceptionhandling;

public class SbiBank {
    private double amount = 0d;

    void withdrawAmount(Double withdraw) {
        if (amount < withdraw) {
            try {
                throw new UserDefinedException("Insufficient Balance");
            } catch (UserDefinedException e) {
                e.printStackTrace();
            }
        } else {
            amount = amount - withdraw;
            System.out.println("After Withdrawal Amount" + amount);
        }
    }

    void deposit(Double deposit) {
        if (deposit > 0) {
            amount = amount + deposit;
            System.out.println("Amount After Deposit" + amount);
        }
    }
}
    class BankImpl {
        public static void main(String[] args) {
            SbiBank sbiBank = new SbiBank();
            sbiBank.deposit(10000d);
            sbiBank.withdrawAmount(50000d);
        }
    }
