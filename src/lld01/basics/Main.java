package lld01.basics;

import lld01.basics.libraryManagement.Book;

public class Main {
    public static void main(String[] args) {
        Students rahul = new Students(); // Object 1 -> when it runs it will occupy memory
        rahul.name = "Rahul";
        rahul.age = 22;
        rahul.batch = "AprilLLD";
        rahul.psp = 90.40;


        Students priya = new Students(); // Object 1 -> when it runs it will occupy memory
        priya.name = "Priya";
        priya.age = 26;
        priya.batch = "AprilLLD";
        priya.psp = 80.40;

        Students amit = new Students(); // Object 1 -> when it runs it will occupy memory
        amit.name = "Amit";
        amit.age = 22;
        amit.batch = "MarchDSA";
        amit.psp = 70.40;

        // System.out.println("Output for rahul is : "+rahul);
        System.out.println("NAME : "+rahul.name);
        System.out.println("AGE : "+rahul.age);
        System.out.println("BATCH : "+rahul.batch);
        System.out.println("PSP : "+rahul.psp);


        Book book = new Book();
        book.title = "";
    }
}
