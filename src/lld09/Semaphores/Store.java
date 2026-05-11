package lld09.Semaphores;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    private Queue<Object> items;

    Store(){
        this.items = new ConcurrentLinkedDeque<>();
        /*
            Why ConcurrentLinkedDeque is used ?
            --> because we are going to perform operations concurrently so always prefer a concurrent data structure,
                it is a thread safe queue, so all the operations preformed on this queue are going to be thread-safe
         */
    }


    public Queue<Object> getItems() {
        return items;
    }

    public void addItem(int id){
        items.add(new Object());
        System.out.println("Item added . Current size : "+items.size()+" ,by thread : "+id);
    }

    public void removeItem(int id){
        items.remove();
        System.out.println("Item removed . Current size : "+items.size()+" ,by thread : "+id);
    }
}
