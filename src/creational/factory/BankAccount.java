package creational.factory;

import java.time.LocalDate;

public abstract class BankAccount {
    private final String name;
    private final LocalDate dateOfOpening;
    private final String cifCode;
    private final double balance;

    public BankAccount(String name, LocalDate dateOfOpening, String cifCode, double balance) {
        this.name = name;
        this.dateOfOpening = dateOfOpening;
        this.cifCode = cifCode;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfOpening() {
        return dateOfOpening;
    }

    public String getCifCode() {
        return cifCode;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();

    public static BankAccount create(BankAccountType type, String name, LocalDate dateOfOpening, String cifCode, double balance){
        BankAccount bankAccount;
        switch(type){
            case SAVINGS:
                bankAccount = new SavingsAccount(name, dateOfOpening, cifCode, balance);
                break;
            case CURRENT:
                bankAccount = new CurrentAccount(name, dateOfOpening, cifCode, balance);
                break;
            case CORPORATE:
                bankAccount = new CorporateAccount(name, dateOfOpening, cifCode, balance);
                break;
            case VIRTUAL:
                bankAccount = new VirtualAccount(name, dateOfOpening, cifCode, balance);
                break;
            default:
                bankAccount = null;
        }
        return bankAccount;
    }
}
