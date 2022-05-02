package models.customers;

import contracts.Observer;

public class RichCustomer implements Observer {
    private final String _name;

    public RichCustomer(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public void update(double propertyTax, double ttpTax) {
        if (propertyTax >= 750f || ttpTax >= 300f) {
            System.out.printf("%s reacted.\n", this.getName());
        }
    }
}
