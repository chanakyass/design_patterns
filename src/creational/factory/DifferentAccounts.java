package creational.factory;

import java.time.LocalDate;

class SavingsAccount extends BankAccount{
    public SavingsAccount(String name, LocalDate dateOfOpening, String cifCode, double balance) {
        super(name, dateOfOpening, cifCode, balance);
    }

    @Override
    public double calculateInterest() {
        return 0.04*getBalance();
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String name, LocalDate dateOfOpening, String cifCode, double balance) {
        super(name, dateOfOpening, cifCode, balance);
    }

    @Override
    public double calculateInterest() {
        return 0.06*getBalance();
    }
}

class CorporateAccount extends BankAccount {
    public CorporateAccount(String name, LocalDate dateOfOpening, String cifCode, double balance) {
        super(name, dateOfOpening, cifCode, balance);
    }

    @Override
    public double calculateInterest() {
        return 0.07*getBalance();
    }
}

class VirtualAccount extends BankAccount {
    public VirtualAccount(String name, LocalDate dateOfOpening, String cifCode, double balance) {
        super(name, dateOfOpening, cifCode, balance);
    }

    @Override
    public double calculateInterest() {
        return 0.05 * getBalance();
    }
}
