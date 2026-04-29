package lld06.concurrency.CustomThread;

public class HelloWorldPrinter implements Runnable{
    public void run(){
        //This is the place where you put your code that needs to be executed in parallel

        for(int i=0; i<5 ; i++){
            System.out.println("hello world -" +i +" : "+Thread.currentThread().getName());
        }

        helperMethod();
    }

    /*
            Question --> from this method if we call another helper method , so thread will execute this helper method
            1. The Main thread
            2. The Thread executing this block of code i.e. the Parallel Thread

            Answer: The Parallel Thread i.e. the thread executing the code inside the run method
    */

    //This will be executed in the thread executing the run
    public void helperMethod(){
        System.out.println("In the helperMethod : "+Thread.currentThread().getName());
    }
}


