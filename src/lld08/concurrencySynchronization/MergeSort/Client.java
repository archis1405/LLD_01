package lld08.concurrencySynchronization.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> arr = new ArrayList<>(List.of(5,4,2,8,1,3,9,6,3));

        ExecutorService executorService = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(arr , executorService);

        Future<ArrayList<Integer>> future = executorService.submit(sorter);

        ArrayList<Integer> ans = future.get();

        System.out.println("The sorted list is : "+ans);

        executorService.shutdown();
    }
}
