package concurrency.mathoperations;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void should_add_numbers() throws Exception {
        double result = calculator.add(3, 5);

//        Assert.assertEquals(7.4, result, 0.6);
        assertEquals(8, result, 0);
    }

    @Test
    public void should_subtract_numbers() throws Exception {
        double result = calculator.subtract(3, 5);

        assertEquals(-2, result, 0);
    }

    @Test
    public void should_divide_numbers() {
        double result = calculator.divide(3, 5);

        assertEquals(0.6, result, 0);
    }

    @Test
    public void should_divide_big_numbers() {
        double result = calculator.divide(1, 3);

//        assertEquals(0.33, result, 0.0033);
//        assertEquals(0.33, result, 0.0034);
        assertEquals(0.33, result, 0.01);
    }

    @Test
    public void should_multiply_numbers() {
        double result = calculator.multiply(3, 5);

        assertEquals(15, result, 0);
    }

}