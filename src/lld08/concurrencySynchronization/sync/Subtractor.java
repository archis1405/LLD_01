package lld08.concurrencySynchronization.sync;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;
    Lock lock;

    public Subtractor(Count count , Lock lock){
        this.count = count;
        this.lock = lock;
    }

    public void run(){
        for(int i=0 ; i<=10000 ; i++){
            lock.lock();
            count.value -= i;

            lock.unlock();
        }
    }
}
