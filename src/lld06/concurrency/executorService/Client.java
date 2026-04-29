package lld06.concurrency.executorService;

import lld06.concurrency.numberPrinter.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        // Creating a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=0 ; i<=100 ; i++){

            NumberPrinter np = new NumberPrinter(i);

            executorService.execute(np);
        }
        executorService.shutdown();

        System.out.println("This is the main theread : " +Thread.currentThread().getName());
    }
}
