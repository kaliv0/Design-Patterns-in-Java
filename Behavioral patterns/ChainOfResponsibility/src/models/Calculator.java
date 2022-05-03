package models;

import contracts.Handler;
import models.handlers.*;

public class Calculator {
    private final Handler _firstHandler;
    private final Handler _secondHandler;
    private final Handler _thirdHandler;
    private final Handler _fourthHandler;

    public Calculator() {
        _firstHandler = new Additor();
        _secondHandler = new Subtractor();
        _thirdHandler = new Multiplicator();
        _fourthHandler = new Divisor();

        _firstHandler.setNext(_secondHandler);
        _secondHandler.setNext(_thirdHandler);
        _thirdHandler.setNext(_fourthHandler);
    }

    public Handler getFirstHandler() {
        return _firstHandler;
    }

    public Handler getSecondHandler() {
        return _firstHandler;
    }

    public Handler getThirdHandler() {
        return _firstHandler;
    }

    public Handler getFourthHandler() {
        return _firstHandler;
    }
}
