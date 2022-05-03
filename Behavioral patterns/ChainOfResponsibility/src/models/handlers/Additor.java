package models.handlers;

import models.Request;

public class Additor extends OperationHandler {
    private final String validOperation = "add";

    @Override
    public void calculate(Request request) {
        double firstNum = request.getFirstNum();
        double secondNum = request.getSecondNum();
        String operation = request.getOperation();

        if (operation.equals(validOperation)) {
            double result = firstNum + secondNum;
            System.out.printf("%.2f plus %.2f equals %.2f.\n", firstNum, secondNum, result);
        } else {
            super.calculate(request);
        }
    }
}
