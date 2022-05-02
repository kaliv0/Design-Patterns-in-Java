package models;

import models.strategies.*;

import java.math.BigDecimal;
import java.util.Objects;

public class DiscountCalculator {
    private final Context _context;
    private final BigDecimal _limit = new BigDecimal(100);

    public DiscountCalculator() {
        _context = new Context();
    }

    public BigDecimal computeDiscount(String holiday, BigDecimal price) {
        int _comparePrice = price.compareTo(_limit);

        if (_comparePrice == 0 || _comparePrice > 0) {
            if (Objects.equals(holiday, "Christmas")) {
                _context.setStrategy(new ChristmasStrategy());
            } else if (Objects.equals(holiday, "Easter")) {
                _context.setStrategy(new EasterStrategy());
            } else if (Objects.equals(holiday, "New Year")) {
                _context.setStrategy(new NewYearStrategy());
            } else {
                _context.setStrategy(new RestStrategy());
            }
        } else {
            _context.setStrategy(new RestStrategy());
        }
        return _context.computeDiscount(price);
    }
}
