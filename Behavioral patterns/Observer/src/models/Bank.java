package models;

import contracts.Observer;
import contracts.*;

import java.util.*;


public class Bank implements Subject {
    private final Collection<Observer> _customers;
    private double _propertyTax;
    private double _ttpTax;

    public Bank() {
        _customers = new ArrayList<>();
        _propertyTax = 500f;
        _ttpTax = 200f;
    }

    public void subscribe(Observer customer) {
        _customers.add(customer);
        System.out.println("New customer added to list of customer.");
    }

    public void unsubscribe(Observer customer) {
        _customers.remove(customer);
        System.out.println("Customer removed.");
    }

    public void sendNotification() {
        System.out.println("Bank is notifying subscribed customers about tax price changes.");
        for (var customer : _customers) {
            customer.update(_propertyTax, _ttpTax);
        }
    }

    public void changeTaxes(double taxChange) {
        System.out.println("=========");
        System.out.println("Bank is raising tax prices.");

        _propertyTax += (_propertyTax * taxChange);
        _ttpTax *= taxChange;

        try {
            Thread.sleep(3000);
//            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("Sleep interrupted.");
        }
        System.out.printf("Tax prices has been raised with %.0f percent.\n", taxChange * 100);
        this.sendNotification();
    }
}
