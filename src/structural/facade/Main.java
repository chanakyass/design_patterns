package structural.facade;

/*
Definition: Structural pattern that is used to abstract away the interactions between one or more complex and hierarchical entities
to achieve a result which can be used by the client.
 */

public class Main {
    public static void main(String[] args) {
        String [] items = {"idly", "puri"};
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.orderItems(items);
    }
}
