public class Memento {
    private final Quote _quote;

    public Memento(Quote quote) {
        this._quote = quote;
    }

    public Quote getQuote() {
        return _quote;
    }
}
