package by.epamtc.task01.service;

public class SortingService {
    public static int[] bubbleSort(int [] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = (array.length - 1); j >= (i + 1); j--) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        return array;
    }
}
