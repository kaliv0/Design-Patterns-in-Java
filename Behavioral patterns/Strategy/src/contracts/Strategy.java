package contracts;

import java.math.BigDecimal;

public interface Strategy {
    BigDecimal compute(BigDecimal price);
}
