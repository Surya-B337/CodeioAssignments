package Week4;

interface Payment{
    public void pay();
    public void refund();
}
class CreditCardPayment implements Payment{
    public  void pay(){
        System.out.println("Pay Amount Through Credit Card");
    }

    public void refund(){
        System.out.println("Send me a request to refund the amount");
    }
}

class UPIPayment implements Payment{
    public void pay(){
        System.out.println("Pay through Google UPI");
    }
    public void refund(){
        System.out.println("Amount will be refunded within 24 hrs");
    }
}

class PaymentDemo{
    public static void main(String[] args) {
        Payment cpp = new CreditCardPayment();
        cpp.pay();
        cpp.refund();

        System.out.println("-----------------------");

        Payment up = new UPIPayment();
        up.pay();
        up.refund();
    }
}