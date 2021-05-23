package structural.proxy.privacy;

public class PaymentProcessProxy implements PaymentProcess{
    private final PaymentProcess paymentProcess;
    private final Merchant merchant;

    public PaymentProcessProxy(PaymentProcess paymentProcess, Merchant merchant) {
        this.paymentProcess = paymentProcess;
        this.merchant = merchant;
    }

    @Override
    public void makePayment() {
        // Do something to authorize the payment.
        // Or maybe check if the merchant is licensed to use the payment system.
        if(authenticated())
            paymentProcess.makePayment();
    }

    private boolean authenticated(){
        return merchant.getPaymentLicense() != null;
    }
}
