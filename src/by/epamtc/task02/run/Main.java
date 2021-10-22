package by.epamtc.task02.run;

import by.epamtc.task02.service.SortArrayByBubble;
import by.epamtc.task02.service.impl.SortingByMaxElement;
import by.epamtc.task02.service.impl.SortingByMinElement;
import by.epamtc.task02.service.impl.SortingBySumOfElements;
import by.epamtc.task02.view.PrintResult;

public class Main {
    public static void main(String[] args) {
         int [][] array = new int[][]{ { 22, 10, 3, 4, 5 }, { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 3, 4, 5, 6, 7, 8, 9 },
                { 2, 3, 4, 5, 6, 7 }, { 8, 54, 9, 10, 11, 12, 13, 14, 15, 16, 17}, {1, 6, 7, 8, 9, 10, 11, 12, 13 },
                { 4, 5, 6, 7, 2, 9, 10, 11 } };

        SortingByMaxElement sortingByMaxElement = new SortingByMaxElement();
        SortingBySumOfElements sortingBySumOfElements = new SortingBySumOfElements();
        SortingByMinElement sortingByMinElement = new SortingByMinElement();

        PrintResult.printResult(SortArrayByBubble.sortByAsc(array, sortingByMaxElement));
        PrintResult.printResult(SortArrayByBubble.sortByDesc(array, sortingByMaxElement));

        PrintResult.printResult(SortArrayByBubble.sortByAsc(array, sortingBySumOfElements));
        PrintResult.printResult(SortArrayByBubble.sortByDesc(array, sortingBySumOfElements));
//
        PrintResult.printResult(SortArrayByBubble.sortByAsc(array, sortingByMinElement));
        PrintResult.printResult(SortArrayByBubble.sortByDesc(array, sortingByMinElement));

    }
}
