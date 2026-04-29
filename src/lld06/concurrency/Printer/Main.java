package lld06.concurrency.Printer;

// All code executes in Main Thread
public class Main {
    public static void main(String[] args) {
        System.out.println("Hi from the main Thread : "+Thread.currentThread().getName());

        // Actual instance of our class
        HelloWorldPrinter printer = new HelloWorldPrinter();
        //Run the task
        printer.run();
    }
}

/*
STEP 01 : Define the task ; eg : print hello world multiple times

STEP 02 : implements Runnable --> this is tell java to execute the tasks in parallel
            Runnable interface has only one method i.e. run()

STEP 03 : Now inside the runnable method write the code that you want to get executed in parallel

STEP 04 : Now run the task from a thread

STEP 05 : Now create an instance of the thread in the class you are calling it from

     So here all of the code is going to be executed in the main thread only
     Unless and until I am creating a new thread explicitly all of the code will be executed in the main thread only

 */
