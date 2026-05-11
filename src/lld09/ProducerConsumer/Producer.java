package lld09.ProducerConsumer;

public class Producer implements Runnable{
    private Store store;

    Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while(true){

            //Before even the threads can go and ckeck the stock/size of the store , we will lock the store
            synchronized (store){
                //is there space for me to produce , i.e. space available or not
                if(store.getItems().size() < store.getMaxSize()){
                    store.addItem(new Object());
                }
            }
            //Unlock the store
            //Basically we are only allowing one producer to enter the store and add 1 item

        }
    }
}

