package by.epamtc.task01.service;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayService {
    public static int[] minMaxElementOfArray(int []arr){
        int max = arr[0];
        int min = arr[0];

        for (int element : arr) {
            if (element > max) {
                max = element;
            }
            if (element <= min) {
                min = element;
            }
        }
        return new int[]{min, max};
    }

    public static boolean binarySearch(int[] array, int element){
        int[] sortedArray = SortingService.bubbleSort(array);
        return isContainElement(sortedArray, element);
    }

    private static boolean isContainElement(int [] array, int element){
        int first = 0;
        int last = array.length - 1;

        int position = (first + last) / 2;

        while ((array[position] != element) && (first <= last)) {
            if (array[position] < element) {
                first = position + 1;
            } else {
                last = position - 1;
            }
            position = (first + last) / 2;
        }
        return first <= last;
    }

    public static List<Integer> primeNumbersOfArray(int[] arr){
        List<Integer> primeList = new ArrayList<>();
        for (int element: arr){
            if(element == 2){
                primeList.add(element);
                continue;
            }
            for (int i = (element - 1); i > 1; i--){
                if((element % i) == 0) break;
                if(i == 2){
                    primeList.add(element);
                }
            }
        }return primeList;
    }
}
