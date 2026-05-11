package lld09.Semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;

    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    private int id;

    Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore, int id){
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.id = id;
    }

    @Override
    public void run() {
        //let say here p=5,c=0
        while (true){
            try {
                producerSemaphore.acquire();//waits for an empty slot
                store.addItem(id);
                consumerSemaphore.release();// here we have p=4 and c=1,we are telling one customer can enter the store
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // restores the interrupt flg for that thread
                //throw new RuntimeException(e); can also do this
                break;
            }
        }
    }
}
