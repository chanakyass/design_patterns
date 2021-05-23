package structural.proxy.privacy;

public class Merchant {
    private final String name;
    private final String paymentLicense;

    public Merchant(String name, String paymentLicense) {
        this.name = name;
        this.paymentLicense = paymentLicense;
    }

    public String getName() {
        return name;
    }

    public String getPaymentLicense() {
        return paymentLicense;
    }
}
