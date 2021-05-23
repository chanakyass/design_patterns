package structural.proxy.privacy;

public class PaymentProcessImpl implements PaymentProcess{
    @Override
    public void makePayment() {
        System.out.println("Transfer money from account A to account B");
    }
}
