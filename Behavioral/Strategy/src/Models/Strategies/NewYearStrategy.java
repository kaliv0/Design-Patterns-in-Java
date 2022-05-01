package Models.Strategies;

import java.math.BigDecimal;

import Contracts.Strategy;

public class NewYearStrategy implements Strategy {
    private final BigDecimal discountPercentage = new BigDecimal(0.01);

    @Override
    public BigDecimal compute(BigDecimal price) {
        return (price).multiply(discountPercentage);
    }
}
