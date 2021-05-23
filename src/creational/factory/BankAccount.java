package creational.factory;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.getBalance(), getBalance()) == 0
                && getName().equals(that.getName()) && getDateOfOpening().equals(that.getDateOfOpening()) && getCifCode().equals(that.getCifCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDateOfOpening(), getCifCode(), getBalance());
    }

    public abstract double calculateInterest();
}
