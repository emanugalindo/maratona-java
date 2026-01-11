package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", end - start);
    }

    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricessAsyncFuture1 = storeService.getPricessAsyncFuture("Store 1");
        Future<Double> pricessAsyncFuture2 = storeService.getPricessAsyncFuture("Store 2");
        Future<Double> pricessAsyncFuture3 = storeService.getPricessAsyncFuture("Store 3");
        Future<Double> pricessAsyncFuture4 = storeService.getPricessAsyncFuture("Store 4");
        try {
            System.out.println(pricessAsyncFuture1.get());
            System.out.println(pricessAsyncFuture2.get());
            System.out.println(pricessAsyncFuture3.get());
            System.out.println(pricessAsyncFuture4.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", end - start);
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricessAsyncFuture1 = storeService.getPricessAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> pricessAsyncFuture2 = storeService.getPricessAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> pricessAsyncFuture3 = storeService.getPricessAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> pricessAsyncFuture4 = storeService.getPricessAsyncCompletableFuture("Store 4");

        System.out.println(pricessAsyncFuture1.join());
        System.out.println(pricessAsyncFuture2.join());
        System.out.println(pricessAsyncFuture3.join());
        System.out.println(pricessAsyncFuture4.join());
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", end - start);
    }
}
