/*
    Chain of Responsibility lets you pass requests along a chain of handlers.
    Upon receiving a request, each handler decides either to process the request
    or to pass it to the next handler in the chain.
*/

import models.*;

public class Client {
    public static void main(String[] args) {
        var calculator = new Calculator();
        var request = new Request(4.4, 2, "divide");
        calculator.processRequest(request);

        request.setFirstNum(5);
        request.setOperation("multiply");
        calculator.processRequest(request);

        request.setSecondNum(8.1);
        request.setOperation("add");
        calculator.processRequest(request);

        request.setOperation("subtract");
        calculator.processRequest(request);
    }
}
