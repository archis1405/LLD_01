package lld06.concurrency.variablePool;

public class NumberPrinter implements Runnable{
    private int n;

    public NumberPrinter(int n){
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println("N : "+n+" : "+Thread.currentThread().getName());
    }


}
