package Contracts;

import java.math.BigDecimal;

public interface Strategy {
    BigDecimal compute(BigDecimal price);
}
