import models.*;

public class Client {
    public static void main(String[] args) {
        var calculator = new Calculator();
        var request = new Request(4.4, 2, "divide");
        calculator.getSecondHandler().calculate(request);

        request.setFirstNum(5);
        request.setOperation("multiply");
        calculator.getFirstHandler().calculate(request);

        request.setSecondNum(8.1);
        request.setOperation("add");
        calculator.getThirdHandler().calculate(request);

        request.setOperation("subtract");
        calculator.getFourthHandler().calculate(request);
    }
}
