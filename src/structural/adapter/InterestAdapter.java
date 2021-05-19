package structural.adapter;

import java.util.Arrays;

public class InterestAdapter implements InterestForPool{

    private final InterestForAccount interestForAccount;
    public InterestAdapter() {
         this.interestForAccount = new InterestForAccount();
    }

    @Override
    public double calculateInterest(double[] principals) {
        return interestForAccount.calculateInterest(Arrays.stream(principals).sum());
    }
}
