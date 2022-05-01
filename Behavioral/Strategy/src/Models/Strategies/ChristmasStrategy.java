package Models.Strategies;

import java.math.BigDecimal;

import Contracts.Strategy;

public class ChristmasStrategy implements Strategy {
    private final BigDecimal discountPercentage = new BigDecimal(0.05);

    @Override
    public BigDecimal compute(BigDecimal price) {
        return (price).multiply(discountPercentage);
    }
}
