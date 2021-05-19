package structural.facade;

import java.util.Arrays;
import java.util.Map;

class Order{
    private String[] items;
    private static final Map<String, Double> menuPrices = Map.of("idly", 30.0, "puri", 40.0);

    public Order(String[] items) {
        this.items = items;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public double getBillAmount() {
        return Arrays.stream(items).mapToDouble(menuPrices::get).sum();

    }


    @Override
    public String toString() {
        return "Order{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}

public class OrderSubsystem {
    private final BankInteractionSubsystem bankInteraction;

    public OrderSubsystem() {
        this.bankInteraction = new BankInteractionSubsystem();
    }

    public void generateBill(Order order){
        System.out.println(order);
    }

    public void makePayment(Order order){
        bankInteraction.makeTransaction(order.getBillAmount());
    }
}
