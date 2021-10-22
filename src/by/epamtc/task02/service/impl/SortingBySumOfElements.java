package by.epamtc.task02.service.impl;

import by.epamtc.task02.service.JaggedArraySortingService;
import by.epamtc.task02.service.ReplacementService;

public class SortingBySumOfElements implements JaggedArraySortingService {
    ReplacementService replacementService = new ReplacementServiceImpl();

    @Override
    public void sortAsc(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                int sum1 = sumOfElements(array[j]);
                int sum2 = sumOfElements(array[j - 1]);
                replacementService.sortingByCompareMinMaxElementsByAsc(sum1, sum2, array,j);
            }
        }
    }

    @Override
    public void sortDesc(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                int sum1 = sumOfElements(array[j]);
                int sum2 = sumOfElements(array[j - 1]);
                replacementService.sortingByCompareMinMaxElementsByDesc(sum1, sum2, array,j);
            }
        }
    }

    private static int sumOfElements(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
