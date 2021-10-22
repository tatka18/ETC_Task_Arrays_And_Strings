package by.epamtc.task02.service.impl;

import by.epamtc.task02.service.ReplacementService;

public class ReplacementServiceImpl implements ReplacementService {

    @Override
    public void sortingByCompareMinMaxElementsByAsc(int num1, int num2, int [][] array, int j) {
        if (num1 < num2) {
            replacementOperationOfArray(array, j);
        }
    }

    @Override
    public void sortingByCompareMinMaxElementsByDesc(int num1, int num2, int [][] array, int j) {
        if (num1 > num2) {
            replacementOperationOfArray(array, j);
        }
    }

    private void replacementOperationOfArray(int[][] arrayArray, int index){
        int[] tmp;
        tmp = arrayArray[index];
        arrayArray[index] = arrayArray[index - 1];
        arrayArray[index - 1] = tmp;
    }
}
