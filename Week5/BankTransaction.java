package Week5;
class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String message){
        super(message);
    }
}
class  BankAccount{
    private double balance;

    BankAccount(double amount){
        balance = amount;
        System.out.println("Balance:"+balance);
    }

    double getBalance(){
        return balance;
    }
    synchronized void deposit(int amount) throws InsufficientBalanceException {
        if(amount <= 0) {
           throw new InsufficientBalanceException(Thread.currentThread().getName()+ "Deposit must be positive.");
        }
        balance = balance + amount;
        System.out.println("Deposited Amount::"+amount);
        System.out.println("Remaining Balance::"+balance);
    }

    synchronized void withdraw(int amount) throws InsufficientBalanceException{
        if(amount < 0){
            throw new InsufficientBalanceException(Thread.currentThread().getName()+ " Withdraw amount cannot be negative");
        }else if (amount > balance){
            throw new InsufficientBalanceException(Thread.currentThread().getName()+ " Insufficient balance! You tried to withdraw " + amount + " but only have " + balance);
        }else{
            balance = balance - amount;
            System.out.println("Withdraw Amount::"+amount);
            System.out.println("Remaining Balance::"+balance);
        }
    }

}

class UserTransaction implements Runnable{
    private BankAccount account;
    private static final int max_transaction_amount = 500;

    public UserTransaction(BankAccount account){
        this.account = account;
    }
    @Override
    public void run(){
        for(int i=0; i < 5; i++){
            int amount = (int) (Math.random() * max_transaction_amount) + 1;
            boolean isDeposit = Math.random() < 0.5;
            try {
                if (isDeposit) {
                    account.deposit(amount);
                } else {
                    account.withdraw(amount);
                }
            }catch (InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class BankAccountDemo{

    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(1000);
        Thread user1 = new Thread(new UserTransaction(sharedAccount),"User1");
        Thread user2 = new Thread(new UserTransaction(sharedAccount),"User2");
        Thread user3 = new Thread(new UserTransaction(sharedAccount),"User3");
        user1.start();
        user2.start();
        user3.start();
        try {
            user1.join();
            user2.join();
            user3.join();
        }catch (InterruptedException e){
            e.getMessage();
        }
        System.out.println("Final Balance>>>"+sharedAccount.getBalance());
    }
}


















