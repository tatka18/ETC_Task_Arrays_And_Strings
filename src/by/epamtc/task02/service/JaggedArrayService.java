package by.epamtc.task02.service;

public class JaggedArrayService {

    public static int[][] bubbleSortByMaxElementDesc(int[][] array) {
        int [][] sortedArray = bubbleSortingArrayByDesc(array);
        bubbleSortingArrayByFirstElementDesc(sortedArray);
        return sortedArray;
    }

    public static int[][] bubbleSortByMaxElementAsc(int[][] array) {
        int [][] sortedArray = bubbleSortingArrayByDesc(array);
        bubbleSortingArrayByFirstElementAsc(sortedArray);
        return sortedArray;
    }

    public static int[][] bubbleSortByMinElementDesc(int[][] array) {
       int [][] sortedArray = bubbleSortingArrayByAsc(array);
       bubbleSortingArrayByFirstElementDesc(sortedArray);
       return sortedArray;
    }

    public static int[][] bubbleSortByMinElementAsc(int[][] array) {
        int [][] sortedArray = bubbleSortingArrayByAsc(array);
        bubbleSortingArrayByFirstElementAsc(sortedArray);
        return sortedArray;
    }

    public static int[][] bubbleSortBySumOfElementsAsc(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                int sum1 = sumOfElements(array[j]);
                int sum2 = sumOfElements(array[j - 1]);
                settingByCompareSumOfElementsInArrayAsc(sum1, sum2, array, j);
            }
        }return array;
    }

    public static int[][] bubbleSortBySumOfElementsDesc(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                int sum1 = sumOfElements(array[j]);
                int sum2 = sumOfElements(array[j - 1]);
                settingByCompareSumOfElementsInArrayDesc(sum1, sum2, array, j);
            }
        }return array;
    }

    public static int[][] bubbleSortingArrayByAsc(int [][] arrayArray) {
        for (int[] array : arrayArray) {
            for (int i = 0; i < array.length; i++) {
                for (int j = (array.length - 1); j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        settingOperationArray(array, j);
                    }
                }
            }
        }
        return arrayArray;
    }

    public static int[][] bubbleSortingArrayByDesc(int [][] arrayArray) {
        for (int [] array : arrayArray) {
            for (int i = 0; i < array.length; i++) {
                for (int j = (array.length - 1); j > 0; j--) {
                    if (array[j] > array[j - 1]) {
                        settingOperationArray(array, j);
                    }
                }
            }
        }
        return arrayArray;
    }

    public static void bubbleSortingArrayByFirstElementAsc(int [][] arrayArray) {
        for (int i = 0; i < arrayArray.length; i++) {
            for (int j = arrayArray.length - 1; j > 0; j--) {
                int[] num1 = arrayArray[j];
                int[] num2 = arrayArray[j - 1];
                settingByCompareElementsInArrayAsc(num1, num2, arrayArray, j);
            }
        }
    }

    public static void bubbleSortingArrayByFirstElementDesc(int [][] arrayArray) {
        for (int i = 0; i < arrayArray.length; i++) {
            for (int j = arrayArray.length - 1; j > 0; j--) {
                int[] num1 = arrayArray[j];
                int[] num2 = arrayArray[j - 1];
                settingByCompareElementsInArrayDesc(num1, num2, arrayArray, j);
            }
        }
    }

    public static int sumOfElements(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    private static void settingByCompareSumOfElementsInArrayDesc(int sum1, int sum2, int[][] array , int j){
        if (sum1 > sum2) {
            settingOperationArrayArray(array, j);
        }
    }

    private static void settingByCompareSumOfElementsInArrayAsc(int sum1, int sum2, int[][] array , int j){
        if (sum1 < sum2) {
            settingOperationArrayArray(array, j);
        }
    }

    private static void settingByCompareElementsInArrayDesc(int[] num1, int[] num2, int[][] arrayArray, int j){
        if (num1[0] > num2[0]) {
            settingOperationArrayArray(arrayArray, j);
        }
    }

    private static void settingByCompareElementsInArrayAsc(int[] num1, int[] num2, int[][] arrayArray, int j){
        if (num1[0] > num2[0]) {
            settingOperationArrayArray(arrayArray, j);
        }
    }

    private static void settingOperationArrayArray(int[][] arrayArray, int index){
        int[] tmp;
        tmp = arrayArray[index];
        arrayArray[index] = arrayArray[index - 1];
        arrayArray[index - 1] = tmp;
    }

    private static void settingOperationArray(int [] array, int index){
        int tmp;
        tmp = array[index];
        array[index] = array[index - 1];
        array[index - 1] = tmp;
    }
}
