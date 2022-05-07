/*
    Observer pattern lets you define a subscription mechanism to notify multiple objects
    about any events that happen to the object they’re observing.
 */
import models.Bank;
import models.customers.*;

public class Client {
    public static void main(String[] args) {
        var bank = new Bank();
        var firstCustomer = new RichCustomer("Peter Peterson");
        var secondCustomer = new PoorCustomer("Foo Bar");

        bank.subscribe(firstCustomer);
        bank.subscribe(secondCustomer);

        var thirdCustomer = new PoorCustomer("Robinson Crusoe");
        bank.subscribe(thirdCustomer);

        bank.changeTaxes(0.2f);

        bank.unsubscribe(thirdCustomer);
        bank.changeTaxes(0.5f);
    }
}
