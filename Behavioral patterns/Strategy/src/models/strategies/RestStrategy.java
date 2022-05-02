package models.strategies;

import java.math.BigDecimal;

import contracts.Strategy;

public class RestStrategy implements Strategy {
    @Override
    public BigDecimal compute(BigDecimal price) {
        return new BigDecimal("0");
    }
}
