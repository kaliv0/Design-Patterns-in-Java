public class Originator {
    private Quote _quote;

    public Originator(Quote quote) {
        this._quote = (Quote) quote.clone();
    }

    public Memento saveState() {
        return new Memento(_quote);
    }

    public void restoreState(Memento memento) {
        this._quote = memento.getQuote();
    }

    public void changeQuote(Quote quote) {
        this._quote = (Quote) quote.clone();
    }
}
