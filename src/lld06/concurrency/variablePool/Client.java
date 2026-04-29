package lld06.concurrency.variablePool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        // Creating a fixed thread pool

       ExecutorService ex = Executors.newCachedThreadPool();
        for(int i=0 ; i<=100 ; i++){
            NumberPrinter np = new NumberPrinter(i);
            ex.execute(np);
        }
        ex.shutdown();

        System.out.println("This is the main theread : " +Thread.currentThread().getName());

        // For printing 100 numbers it is spawning up 44 threads at a max
    }
}
