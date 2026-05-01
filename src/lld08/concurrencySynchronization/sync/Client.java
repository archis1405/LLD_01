package lld08.concurrencySynchronization.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Using Locks
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock(); //mutex in java


        Count count = new Count();

        Adder adder = new Adder(count , lock);
        Subtractor subtractor = new Subtractor(count , lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        /*
            The two threads might finish at different time, so we need to wait for the threads to finish
            both the threads should wait for one another

            what join does --> on line t1.join(); it says i will wait for Thread t1 to finish
                               and on line t2.join() it says i will wait for Thread t2 to finish

            Once both are done --> then only we will be executing the next line
         */
        System.out.println("Thread 1 : " +t1.getState());
        System.out.println("Thread 2 : " +t2.getState());
        t1.join();
        t2.join();

        System.out.println("Value : "+count.value); // the outpul will always be 0 as we are using locks to make the code threadsafe
    }
}
