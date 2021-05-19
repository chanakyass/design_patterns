package behavioural.adapter;
/*
It is used when out of two incompatible classes one wants to use the functionality of the other.
We introduce a wrapper around the class that has already implemented the functionality which is known as an adapter
which also is an implementation of the interface who's functionality is not implemented.
So essentially adapter composes of the object who's functionality is known and provides implementation to the interface
which needs to use the known functionality.
 */
public class Main {
    public static void main(String[] args) {
        InterestForPool interest = new InterestAdapter();
        System.out.println(interest.calculateInterest(new double[]{11.1, 12.2, 13.3}));
    }
}
