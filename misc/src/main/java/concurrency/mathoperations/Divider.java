package concurrency.mathoperations;

import java.util.concurrent.Callable;

public class Divider implements Callable<Double>{

    private Calculator calculator = new Calculator();
    private double price;
    private double divisor;

    public Divider(double price, double divisor) {
        this.price = price;
        this.divisor = divisor;
    }

    public Double call() throws Exception {
        return calculator.divide(price, divisor);
    }
}
