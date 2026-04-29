package lld06.concurrency.numberPrinter;

//Print numbers from 1 to 10 and every number is printed by a different thread
public class Main {
    public static void main(String[] args) {

        for(int i=0 ; i<=10 ; i++){
            NumberPrinter np = new NumberPrinter(i);

            Thread t = new Thread(np);

            t.start();
        }


        System.out.println("This is the main theread : " +Thread.currentThread().getName());
    }
}

/*
    Question 1: Will the numbers be printed in order now?
    --> NO, it will be printed randomly

    Question 2: Why are the numbers not printed in order?
    --> As we are running all the threads parallel, it is up to the OS now to decide which thread it will
        execute first and which thread it will execute next it is not upto the java code now


 */


