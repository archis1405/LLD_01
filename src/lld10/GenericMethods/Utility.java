package lld10.GenericMethods;

public class Utility {
    //<T> before the return type declares the T for this method i.e. Generic type for this method
    public static <T> void printArray(T[] array){
        for(T item : array){
            System.out.print(item +" ");
        }
        System.out.println("");
    }

    public static void printArr(int[] arr){
        for(int item : arr){
            System.out.print(item +" ");
        }
        System.out.println("");
    }

    //The two methods are same , only difference is the generic type
}
