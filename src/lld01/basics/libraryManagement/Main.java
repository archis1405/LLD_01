package lld01.basics.libraryManagement;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Harry Potter";
        book.price = 149.99;
        book.author= "JK Rowling";
        book.isbn = "123452";
        book.pages=200;
        book.available = true;

        book.display();

        book.borrow();
        book.isAvailable();
        book.returnBook();
        book.isAvailable();
    }

}
