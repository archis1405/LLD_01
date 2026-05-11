package lld09.concurrencySemaphores.synchronizedMethods;

public class Count {
    private long value = 0;

    /*
        As count class we should provide methods of the operations that can be performed, for our case it is
        addition and subtraction.
        Similarly, suppose we have a car class so there we can have methods like forward, reverse, stop, left, right, etc.

       the method in the count is made synchronized as inside Count class only multiple methods will be accessed.

       Client --> Adder, Subtractor
       Producer --> Count
     */

    //Java takes a lock on "this" --> current object, the object on which the method is called
    public synchronized  void increment(int value){
        this.value += value;
    }

    public synchronized void decrement(int value){
        this.value -= value;
    }

    //This method is made synchronized as we donot want to read any stale values
    public synchronized long getValue(){
        return this.value;
    }

}

