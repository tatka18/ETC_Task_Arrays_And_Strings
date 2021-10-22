package by.epamtc.task02.service.impl;

import by.epamtc.task02.service.JaggedArraySortingService;
import by.epamtc.task02.service.ReplacementService;

public class SortingByMinElement implements JaggedArraySortingService {

    ReplacementService replacementService = new ReplacementServiceImpl();
    @Override
    public void sortAsc(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                int minElement1 = minElement(array[j]);
                int minElement2 = minElement(array[j - 1]);
                replacementService.sortingByCompareMinMaxElementsByAsc(minElement1, minElement2, array, j);
            }
        }
    }

    @Override
    public void sortDesc(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                int minElement1 = minElement(array[j]);
                int minElement2 = minElement(array[j - 1]);
                replacementService.sortingByCompareMinMaxElementsByDesc(minElement1, minElement2, array, j);
            }
        }
    }

    private int minElement(int [] array){
        int minElement = array[0];
        for(int element: array){
            if(element < minElement){
                minElement = element;
            }
        }
        return minElement;
    }
}
