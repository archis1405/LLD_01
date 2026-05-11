package lld09.concurrencySemaphores.synchronizedMethods;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        System.out.println("Thread 1 : " +t1.getState());
        System.out.println("Thread 2 : " +t2.getState());
        t1.join();
        t2.join();

        System.out.println("Value : "+count.getValue());

    }
}
