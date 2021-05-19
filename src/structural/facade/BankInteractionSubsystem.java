package structural.facade;

public class BankInteractionSubsystem {
    public void makeTransaction(double amount){
        System.out.println("amount " + amount + " deducted after transaction");
    }
}
