package by.epamtc.task02.run;

import by.epamtc.task02.service.JaggedArrayService;
import by.epamtc.task02.view.PrintResult;

public class Main {
    public static void main(String[] args) {
         int [][] array = new int[][]{ { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 3, 4, 5, 6, 7, 8, 9 },
                { 2, 3, 4, 5, 6, 7 }, { 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17}, { 5, 6, 7, 8, 9, 10, 11, 12, 13 },
                { 4, 5, 6, 7, 8, 9, 10, 11 } };

        PrintResult.printResult(JaggedArrayService.bubbleSortBySumOfElementsAsc(array));
        PrintResult.printResult(JaggedArrayService.bubbleSortBySumOfElementsDesc(array));

        PrintResult.printResult(JaggedArrayService.bubbleSortByMinElementDesc(array));
        PrintResult.printResult(JaggedArrayService.bubbleSortByMinElementAsc(array));

        PrintResult.printResult(JaggedArrayService.bubbleSortByMaxElementDesc(array));
        PrintResult.printResult(JaggedArrayService.bubbleSortByMaxElementAsc(array));

    }
}
