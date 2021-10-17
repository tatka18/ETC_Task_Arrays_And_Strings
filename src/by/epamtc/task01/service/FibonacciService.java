package by.epamtc.task01.service;

import java.util.ArrayList;
import java.util.List;

public class FibonacciService {
    public static List<Integer> fibonacciNumbersFromArray(int [] array){
        List<Integer> integerList = new ArrayList<>();

        int [] fibonacciNumbers = fibonacciNumbers();
        for(int number : fibonacciNumbers){
            boolean result = IntegerArrayService.binarySearch(array, number);
            if(result){
                integerList.add(number);
            }
        }
        return integerList;
    }

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
