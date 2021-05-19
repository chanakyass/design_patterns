package structural.facade;

public class OrderFacade {
    private final OrderSubsystem orderSubsystem;

    public OrderFacade() {
        this.orderSubsystem = new OrderSubsystem();
    }

    public void orderItems(String [] items) {
        Order order = new Order(items);
        orderSubsystem.makePayment(order);
        orderSubsystem.generateBill(order);
    }
}
