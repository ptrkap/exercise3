package concurrency.mathoperations;

import java.util.concurrent.Callable;

//@lombok.Setter
@lombok.Getter
@lombok.RequiredArgsConstructor
//@lombok.AllArgsConstructor
//@lombok.NoArgsConstructor
public class Multiplier implements Callable<Double>{

    private Calculator calculator = new Calculator();
    private double price;
    private final double factor;

    public Double call() throws Exception {
        return calculator.multiply(price, factor);
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier(2.5);
        System.out.println(multiplier.getPrice());
        System.out.println(multiplier.getFactor());
    }
}
