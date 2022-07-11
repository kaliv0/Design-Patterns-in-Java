public class Quote {

    private String _text;
    private String _author;

    public Quote(String text, String author) {
        this._text = text;
        this._author = author;
    }

    public String getText() {
        return _text;
    }

    public String getAuthor() {
        return _author;
    }

    public void setText(String _text) {
        this._text = _text;
    }

    public void setAuthor(String _author) {
        this._author = _author;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this._author, this._text);
    }

    @Override
    public Object clone() {
        try {
            return (Quote) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Quote(this._text, this._author);
        }
    }
}
