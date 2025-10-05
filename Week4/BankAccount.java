package Week4;

abstract class BankAccount {

    double balance;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);


}

class SavingsAccount extends BankAccount{
    private double minBalance = 1000;
    SavingsAccount(double balance){
        this.balance = balance;
    }
    @Override
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Total Balance::"+balance);
    }
    @Override
    void withdraw(double amount){
        double remainingBalance = balance - amount;
        if(remainingBalance >= minBalance){

            System.out.println("Withdraw amount::"+amount+" Remaining Balance::"+remainingBalance);
        }else{
            System.out.println("Withdraw denied!");
        }
    }
}

class BankAccountDemo{
    public static void main(String[] args) {
        System.out.println("Savings Account");
        SavingsAccount sa = new SavingsAccount(1000);
        sa.deposit(1300);
        sa.withdraw(1200);
    }

}
