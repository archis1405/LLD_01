package lld08.concurrencySynchronization.MergeSort;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<ArrayList<Integer>> {
    private ArrayList<Integer> arr;
    private ExecutorService executorService;

    public Sorter(ArrayList<Integer> arr, ExecutorService executorService){
        this.arr = arr;
        this.executorService = executorService;
    }
    public ArrayList<Integer> call() throws Exception{
        //Base case
        if(arr.size()<=1){
            return arr;
        }
        int mid = arr.size()/2;

        //Create two subarrays
        ArrayList<Integer> left = new ArrayList<>(arr.subList(0,mid));
        ArrayList<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));

        //Create two seperate sorter tasks for left and right subarray to execute the sorting in parallel
        Sorter leftSort = new Sorter(left , executorService);
        Sorter rightSort = new Sorter(right , executorService);

        //Submit the task to the executor to run in parallel
        Future<ArrayList<Integer>> leftFuture =  executorService.submit(leftSort);
        Future<ArrayList<Integer>> rightFuture =  executorService.submit(rightSort);

        //Wait for the results
        ArrayList<Integer> leftSorted = leftFuture.get();
        ArrayList<Integer> rightSorted = rightFuture.get();

        //Merge the two sorted haves
        return merge(leftSorted , rightSorted);
    }

    private ArrayList<Integer> merge(ArrayList<Integer> left , ArrayList<Integer> right){
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i<left.size() && j<right.size()){
            if(left.get(i) <= right.get(j)){
                ans.add(left.get(i));
                i++;
            }
            else{
                ans.add(right.get(j));
                j++;
            }
        }

        while(i<left.size()){
            ans.add(left.get(i));
            i++;
        }
        while(j<right.size()){
            ans.add(right.get(j));
            j++;
        }

        return ans;
    }
}
