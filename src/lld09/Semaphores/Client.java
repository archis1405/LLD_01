package lld09.Semaphores;

import java.util.List;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();

        Semaphore producerSemaphore = new Semaphore(5);// here 5 is the initial no of permits given to a semaphore
        Semaphore consumerSemaphore = new Semaphore(0);// here 0 permits are given initially

        //Creating the producer threads
        for(int i=0 ; i<8 ; i++){
            Producer producer = new Producer(store, producerSemaphore, consumerSemaphore,i);
            new Thread(producer , "Producer"+i).start();
        }

        for(int j=0 ; j<20 ; j++){
            Consumer consumer = new Consumer(store, producerSemaphore, consumerSemaphore,j);
            new Thread(consumer,"Consumer"+j).start(); // naming a thread
        }
    }
}
