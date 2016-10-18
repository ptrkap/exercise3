package concurrency.counter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CounterFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();

        Counter tigerCounter = new Counter("Tiger", 4);
        Counter lionCounter = new Counter("Lion", 4);
        Counter cheetahCounter = new Counter("Cheetah", 4);
        Counter camelCounter = new Counter("Camel", 6);
        Future<Integer> tigerCounterFuture = executorService.submit(tigerCounter);
        Future<Integer> lionCounterFuture = executorService.submit(lionCounter);
        Future<Integer> cheetahCounterFuture = executorService.submit(cheetahCounter);
        System.out.println("checkpoint 1");
        try {
            camelCounter.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("checkpoint 2");
        tigerCounterFuture.get();
        System.out.println("checkpoint 3");
        lionCounterFuture.get();
        System.out.println("checkpoint 4");
        cheetahCounterFuture.get();
        System.out.println("checkpoint 5");
        executorService.shutdown();
    }
}
