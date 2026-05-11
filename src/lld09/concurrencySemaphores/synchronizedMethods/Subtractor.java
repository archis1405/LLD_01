package lld09.concurrencySemaphores.synchronizedMethods;

public class Subtractor implements Runnable{
    Count count = new Count();

    public Subtractor(Count count){
        this.count = count;
    }

    public void run(){
        for(int i=0 ; i<=1000 ; i++){
            /*
            synchronized (count){
                count.value -= i;
            }
             */
            count.decrement(i);
        }
    }

}
