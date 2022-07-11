public class Main {
    public static void main(String[] args) {
        Quote quote = new Quote("The future belongs to those who believe n the beauty of their dreams", "Billy");

        Originator originator = new Originator(quote);
        CareTaker careTaker = new CareTaker(originator);

        careTaker.backUp();
        quote.setAuthor("Elinor");
        originator.changeQuote(quote);
        careTaker.backUp();
        careTaker.undo();
        quote.setAuthor("Eleanor");
        originator.changeQuote(quote);
        careTaker.backUp();

        System.out.println(careTaker.viewHistory());
    }
}
