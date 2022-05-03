package models;

public class Request {
    private double _firstNum;
    private double _secondNum;
    private String _operation;

    public Request(double firstNum, double secondNum, String operation) {
        _firstNum = firstNum;
        _secondNum = secondNum;
        _operation = operation;
    }

    public double getFirstNum() {
        return _firstNum;
    }

    public void setFirstNum(double firstNum) {
        _firstNum = firstNum;
    }

    public double getSecondNum() {
        return _secondNum;
    }

    public void setSecondNum(double secondNum) {
        _secondNum = secondNum;
    }

    public String getOperation() {
        return _operation;
    }

    public void setOperation(String operation) {
        _operation = operation;
    }
}
