package lld09.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private int maxSize = 10;// the max no of shelves in the store

    private List<Object> items;//To maintain the shelves

    public Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    //Adding a shirt to the shelf
    public void addItem(Object item) {
        items.add(item);
        System.out.println("Producer added an item . Current size : "+items.size());
    }

    public void removeItem(){
        items.remove(items.size()-1);
        System.out.println("Consumer removed an item. Current size : "+items.size());
    }
}

