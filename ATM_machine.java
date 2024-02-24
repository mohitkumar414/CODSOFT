import java.util.*;

class bank_account {
    double balance = 105673.59;
}

public class ATM_machine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long amount;
        System.out.println("Press 1 for WITHDRAWING");
        System.out.println("Press 2 for DEPOSITING");
        System.out.println("Press 3 for CHECKING BALANCE");
        int option = sc.nextInt();
        bank_account A1 = new bank_account();
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
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }

    }

    static void withdraw(long amount, bank_account acc) {
        if (amount <= acc.balance) {
            acc.balance = acc.balance - amount;
            System.out.println("Your remaining balance : " + acc.balance);
        } else {
            System.out.println("Invalid balance");
        }
    }

    static void deposit(long amount, bank_account acc) {
        acc.balance += amount;
        System.out.println("Your updated balance : " + acc.balance);
    }

    static void checkBalance(bank_account acc) {
        System.out.println(acc.balance);
    }
}