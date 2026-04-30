package lld08.concurrencySynchronization.callables;

import java.util.concurrent.Callable;

public class SumCalculator implements Callable<Integer> {
    private int n;

    public SumCalculator(int n){
        this.n = n;
    }

    public Integer call() throws Exception{
        int sum = 0;

        for(int i=1 ; i<=n ; i++){
            sum += i;
        }

        return sum; // In callable we can return the values
    }
}
