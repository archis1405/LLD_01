package lld09.Semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;

    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    private int id;

    Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore, int id){
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.id = id;
    }

    @Override
    public void run() {
        while (true){
            try {
                consumerSemaphore.acquire();
                store.removeItem(id);
                producerSemaphore.release();
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
