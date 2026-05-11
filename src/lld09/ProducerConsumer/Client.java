package lld09.ProducerConsumer;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(10);

        //Hire * workers making shirts
        for(int i=0; i<8 ; i++){
            Producer producer = new Producer(store);

            new Thread(producer).start();

            /*
                Another way for new Thread(producer).start() :
                    Thread t1 = new Thread(producer);
                    t1.start();
             */
        }

        //Open my store for 20 customers
        for (int i=0 ; i<20 ; i++){
            Consumer consumer = new Consumer(store);

            new Thread(consumer).start();
        }
    }
}

