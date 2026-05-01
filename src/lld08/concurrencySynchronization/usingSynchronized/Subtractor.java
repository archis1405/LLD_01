package lld08.concurrencySynchronization.usingSynchronized;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count){
        this.count = count;
    }

    public void run(){
        for(int i=0 ; i<=10000 ; i++){
            synchronized(count){
                count.value -= i;
            }
        }
    }
}
