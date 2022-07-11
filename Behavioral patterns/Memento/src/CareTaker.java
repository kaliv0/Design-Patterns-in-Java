import java.util.Stack;

public class CareTaker {
    private final Stack<Memento> _history;
    private final Originator _originator;

    public CareTaker(Originator originator) {
        this._originator = originator;
        this._history = new Stack<>();
    }

    public void backUp() {
        this._history.push(_originator.saveState());
    }

    public void undo() {
        if (this._history.isEmpty()) {
            return;
        }
        Memento currMemento = this._history.pop();
        this._originator.restoreState(currMemento);
    }

    public String viewHistory() {
        return this._history.stream()
                .reduce(new StringBuilder(), (acc, val) ->
                                acc.append(val.getQuote()).append("\n"),
                        StringBuilder::append)
                .toString();
    }
}
