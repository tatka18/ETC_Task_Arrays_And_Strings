package by.epamtc.task02.service;

public class SortArrayByBubble {

    public static int[][] sortByAsc(int [][] array, JaggedArraySortingService jaggedArraySortingService){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                jaggedArraySortingService.sortAsc(array);
            }
        }return array;
    }

    public static int[][] sortByDesc(int [][] array, JaggedArraySortingService jaggedArraySortingService){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                jaggedArraySortingService.sortDesc(array);
            }
        }return array;
    }
}
