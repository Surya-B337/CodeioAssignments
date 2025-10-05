package Week3;

public class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(){
        balance = 0;
    }

    BankAccount(double balance){
        this.balance = balance;
    }

    double deposit(double amount){
        System.out.println("Deposit Amount:"+amount);
        balance = balance + amount;

        return balance;
    }

    double withdraw(double amount){
        System.out.println("Withdraw Amount:"+amount);
        balance = balance - amount;
        return  balance;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println("Balance:"+ba.deposit(10000));
        System.out.println("Balance:"+ba.withdraw(1000));

        BankAccount bap = new BankAccount(4000);
        System.out.println("Balance:"+bap.deposit(100));
        System.out.println("Balance:"+bap.withdraw(200));

    }
}
