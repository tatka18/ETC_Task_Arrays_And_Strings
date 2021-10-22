package by.epamtc.task02.service.impl;

import by.epamtc.task02.service.JaggedArraySortingService;
import by.epamtc.task02.service.ReplacementService;

public class SortingByMaxElement implements JaggedArraySortingService {
    ReplacementService replacementService = new ReplacementServiceImpl();

    @Override
    public void sortAsc(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                int maxElement1 = maxElement(array[j]);
                int maxElement2 = maxElement(array[j - 1]);
                replacementService.sortingByCompareMinMaxElementsByAsc(maxElement1, maxElement2, array, j);
            }
        }
    }

    @Override
    public void sortDesc(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                int maxElement1 = maxElement(array[j]);
                int maxElement2 = maxElement(array[j - 1]);
                replacementService.sortingByCompareMinMaxElementsByDesc(maxElement1, maxElement2, array, j);
            }
        }
    }

    private int maxElement(int [] array){
        int maxElement = array[0];
        for(int element: array){
            if(element > maxElement){
                maxElement = element;
            }
        }
        return maxElement;
    }
}
