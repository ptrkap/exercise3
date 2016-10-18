package concurrency.counter;

import java.util.concurrent.Callable;

public class Counter implements Callable<Integer> {

    private String prefix;
    private int n;

    public Counter(String prefix, int n) {
        this.prefix = prefix;
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int value = 10;
        for (int i = 0; i < n; i++) {
            Thread.sleep(1000);
            value++;
            System.out.println(prefix + "_" + value);
        }
        return value;
    }
}
