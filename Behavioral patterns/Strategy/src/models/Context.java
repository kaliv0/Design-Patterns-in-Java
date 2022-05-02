package models;

import contracts.Strategy;
import models.strategies.RestStrategy;

import java.math.BigDecimal;

public class Context {
    private Strategy _strategy;

    public Context() {
        _strategy = new RestStrategy();
    }

    public void setStrategy(Strategy strategy) {
        _strategy = strategy;
    }

    public BigDecimal computeDiscount(BigDecimal price) {
        return _strategy.compute(price);
    }
}
