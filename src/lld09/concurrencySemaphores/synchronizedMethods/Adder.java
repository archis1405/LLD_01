package lld09.concurrencySemaphores.synchronizedMethods;

public class Adder implements Runnable {
   private Count count;

   public  Adder(Count count){
       this.count = count;
   }

   public void run(){
       for(int i=0 ; i<=1000 ; i++){
           /*
                synchronized (count){
                    count.value += i;
                }
            */
            count.increment(i);
        }
    }
}
