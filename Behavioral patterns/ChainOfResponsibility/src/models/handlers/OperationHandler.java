package models.handlers;

import contracts.Handler;
import models.Request;

public abstract class OperationHandler implements Handler {
    private Handler _nextHandler;

    public void setNext(Handler nextHandler) {
        _nextHandler = nextHandler;
    }

    public void calculate(Request request) {
        if (_nextHandler != null) {
            _nextHandler.calculate(request);
        } else {
            System.out.println("Unfortunately this operation cannot be executed.");
        }
    }
}
