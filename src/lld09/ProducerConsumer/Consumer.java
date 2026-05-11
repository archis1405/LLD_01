package lld09.ProducerConsumer;

public class Consumer implements Runnable{
    private Store store;

    Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {

        while (true) {

            //Basically we are only allowing one consumer to enter the store and buy 1 item, one customer inside the store at a time
            synchronized (store){
                if (store.getItems().size() > 0) {
                    store.removeItem();
                }
            }

        }

    }
}

