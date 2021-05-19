package creational.factory;

import java.time.LocalDate;

/*
Factory pattern creates new instances of objects by just taking the type of object that client needs and providing it to the client
itself instead of making the client handle it.

There is also abstract factory design pattern that takes input to provide factories that further provide objects of specified kind.
Its another layer of abstraction.
 */

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = BankAccount.create(BankAccountType.VIRTUAL, "Chanakya", LocalDate.now(), "ABC", 1100.00);
        System.out.println(bankAccount.calculateInterest());
    }
}
