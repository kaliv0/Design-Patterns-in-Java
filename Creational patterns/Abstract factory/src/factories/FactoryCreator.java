package factories;

public class FactoryCreator {
    public Factory createFactory(String type) {
        Factory factory = null;

        if (type.equals("wild")) {
            factory = new WildFactory();
        } else if (type.equals("domestic")) {
            factory = new DomesticFactory();
        }

        return factory;
    }
}
