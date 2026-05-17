package lld11.inventoryManagementSystem;

import lld11.inventoryManagementSystem.model.Book;
import lld11.inventoryManagementSystem.model.Electronics;
import lld11.inventoryManagementSystem.model.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Book("123","Java Book",2500.0,10,"Anshika"));
        items.add(new Electronics("234","Razer Mouse",5000.0,20,12));

        Collections.sort(items);

        System.out.println("Task 1 result :: ");

        for(Item item : items){
            System.out.println(item.getName()+" : "+item.getPrice());
        }
    }
}
