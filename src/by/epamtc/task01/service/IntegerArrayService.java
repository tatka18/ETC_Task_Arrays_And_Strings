package by.epamtc.task01.service;

public class IntegerArrayService {
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
}