package contracts;

import models.Request;

public interface Handler {
    void setNext(Handler nextHandler);

    void calculate(Request request);
}
