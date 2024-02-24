import java.util.*;

class bank_account {
    double balance = 105673.59;
}

public class ATM_machine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long amount;
        bank_account A1 = new bank_account();
        while (true) {
            System.out.println("Press 1 for WITHDRAWING");
            System.out.println("Press 2 for DEPOSITING");
            System.out.println("Press 3 for CHECKING BALANCE");
            System.out.println("Press 4 to EXIT");
            int option = sc.nextInt();
            if (option == 1) {
                System.out.println("Enter the amount");
                amount = sc.nextInt();
                withdraw(amount, A1);
            } else if (option == 2) {
                System.out.println("Enter the amount");
                amount = sc.nextInt();
                deposit(amount, A1);
            } else if (option == 3) {
                checkBalance(A1);
            } else if (option == 4) {
                System.exit(0);
            } else {
                System.out.println("INVALID CHOICE");
                continue;
            }
        }

    }

    static void withdraw(long amount, bank_account acc) {
        if (amount <= acc.balance) {
            acc.balance = acc.balance - amount;
            System.out.println("Transaction Successful!\nYour remaining balance : " + acc.balance);
        } else {
            System.out.println("Transaction Failed!\nInsufficient balance");
        }
    }

    static void deposit(long amount, bank_account acc) {
        acc.balance += amount;
        System.out.println("transaction Successful!\nYour updated balance : " + acc.balance);
    }

    static void checkBalance(bank_account acc) {
        System.out.println("Your current balance : "+acc.balance);
    }
}
