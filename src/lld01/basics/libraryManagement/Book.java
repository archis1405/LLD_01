package lld01.basics.libraryManagement;
/*
PROBLEM STATEMENT : You are building a library management system , start with the book entity

    Requirements :

    1. A book has a title, author , ISBN , price and number of pages
    2. A book can be borrowed or returned
    3. We should be able to check if the book is currently available or not

 */
public class Book {
    public String title;
    String author;
    double price;
    int pages;
    String isbn;
    boolean available;

    void isAvailable(){
        if(!available){
            System.out.println(title + " is un-available");
        }
        else{
            System.out.println(title + " is available");
        }
    }
    // this function is for return only
    void returnBook(){
        available = true;
        System.out.println(title + " is returned");

        /* else{
            System.out.println(title + "is already available");
        }*/
    }

    void borrow(){
        available = false;
        System.out.println(title + " is borrowed");

    }

    void display(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
        System.out.println("Pages : "+pages);
        System.out.println("ISBN : "+isbn);
    }
}
