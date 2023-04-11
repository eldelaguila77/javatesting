package com.platzi.javatest.discounts;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void totaZeroWhenThereArePrices() {
        PriceCalculator calculator = new PriceCalculator();

        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    public void totalIsTheSumOfPrices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10.2);
        calculator.addPrice(15.5);

        assertThat(calculator.getTotal(), is(25.7));
    }

    @Test
    public void applyDiscountToPrices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(100);
        calculator.addPrice(50);
        calculator.addPrice(50);

        calculator.setDiscount(25);

        assertThat(calculator.getTotal(), is(150.0));
    }
}