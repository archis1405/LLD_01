package lld08.concurrencySynchronization.callables;

//There is a difference in how we run Callables as compared to the Runnables

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        /*
            Executor.execute has only a Runnable command ; So how can we run callable now
            For Callable we have the submit method

            NOTE: submit can be used for both callable and runnable
         */

        SumCalculator sumCalculator = new SumCalculator(100);
        Future<Integer> future =  executorService.submit(sumCalculator); // this is going to return a future

        /*
            When we submit a callable the executor starts running it on a thread, but the result is
            not going to be available immediately , so this future is like a promise that tell that
            the result is going to be available after some time .

            we can do other things in the main thread meanwhile the future is getting returned

            when we need the result we can just call get() method
         */
        // Wrap this in a try-catch block
        Integer ans = future.get(); //this is a blocking call , i.e. block until the result is ready

        // Integer ans = future.get(t, TimeUnit.MICROSECONDS); // it can be SECONDS,MILLISECONDS too and t is an integer

        System.out.println("Sum : "+ans);

        executorService.shutdown();
    }
}
