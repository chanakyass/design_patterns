package structural.facade;

public class Main {
    public static void main(String[] args) {
        String [] items = {"idly", "puri"};
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.orderItems(items);
    }
}
