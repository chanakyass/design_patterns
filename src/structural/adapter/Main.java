package structural.adapter;
/*

Definition: Adapter pattern is used to create a wrapper of a class that implements an interface. The adapter composes of adaptee obj
 and implements the mentioned interface functionality by mimicking the adaptee object.

Problems solved:
1) When two interfaces are incompatible and one of them wants to use a functionality that another offers.
2) When a legacy library has a functionality you want to use you create an adapter that composes the legacy class object and use its functionality.

 */
public class Main {
    public static void main(String[] args) {
        InterestForPool interest = new InterestAdapter();
        System.out.println(interest.calculateInterest(new double[]{11.1, 12.2, 13.3}));
    }
}
