package Models.Strategies;

import java.math.BigDecimal;

import Contracts.Strategy;

public class RestStrategy implements Strategy {
    @Override
    public BigDecimal compute(BigDecimal price) {
        return new BigDecimal(0);
    }
}
