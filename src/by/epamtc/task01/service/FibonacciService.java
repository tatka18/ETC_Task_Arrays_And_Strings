package by.epamtc.task01.service;
public class FibonacciService {
    public static int[] fibonacciNumbers(){
        int[] arr = new int[47];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
}
