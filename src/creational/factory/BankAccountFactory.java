package creational.factory;

import java.time.LocalDate;

public class BankAccountFactory {
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
