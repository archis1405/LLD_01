package lld06.concurrency.CustomThread;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hi from the main Thread : "+Thread.currentThread().getName());

        //Step 1 : Actual instance of our class
        HelloWorldPrinter printer = new HelloWorldPrinter();

        //Step 2: Create a thread and give it your task for execution
        Thread thread1 = new Thread(printer);
        // In the above line we are calling the constructor of the thread class to create an object of thread class

        //Step 3: Start the thread
        thread1.start();
        //THis above line is going to create a new thread and calls the .run method on that thread

        /*
        thread.run(); --> this executed run in the main thread this does not start the new thread
         */

        System.out.println("Main thread continues");
        /*
            The above line is executed by the main thread before the other state execution starts, i.e.
            this is executed parallely to the other thread, so we can say the main thread and the custom
            thread that we created are running in parallel
         */



    }
}

/*
STEP 01: Define the task; eg: print hello world multiple times

STEP 02: implements Runnable --> this is tell java to execute the tasks in parallel
            Runnable interface has only one method i.e. run()

STEP 03: Now inside the runnable method write the code that you want to get executed in parallel

STEP 04: Now run the task from a thread

STEP 05: Now create an instance of the thread in the class you are calling it from

thread.run() -> it just calls the run method in the current thread, not in the thread we created (here it
                will call in the main thread)
thread.start() -> creates a new thread, and the OS will schedule that thread to execute the run method

NOTE: Runnable does-not create a thread, Runnable creates a task

 Now this is creating a new thread and

 */



