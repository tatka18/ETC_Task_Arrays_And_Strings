package by.epamtc.task01.run;

import by.epamtc.task01.model.IntegerArray;
import by.epamtc.task01.scan.Scan;
import by.epamtc.task01.service.FibonacciService;
import by.epamtc.task01.service.IntegerArrayService;
import by.epamtc.task01.service.SortingService;
import by.epamtc.task01.view.PrintResult;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> integerList = Scan.readListFromTextFile();
        int [] mas = new IntegerArray(integerList).getMas();

        PrintResult.printList(integerList);

        int [] minMaxElementOfArray = IntegerArrayService.minMaxElementOfArray(mas);
        PrintResult.printArray(minMaxElementOfArray);

        List<Integer> primeNumbersList = IntegerArrayService.primeNumbersOfArray(mas);
        PrintResult.printList(primeNumbersList);

        int [] bubbleSorted = SortingService.bubbleSort(mas);
        PrintResult.printArray(bubbleSorted);

        int [] insertionSort = SortingService.insertionSort(mas);
        PrintResult.printArray(insertionSort);

        int [] selectionSort = SortingService.selectionSort(mas);
        PrintResult.printArray(selectionSort);

        List<Integer> threeDigitNumberList = IntegerArrayService.threeDigitNumber(mas);
        PrintResult.printList(threeDigitNumberList);

        boolean resultByBinarySearch = IntegerArrayService.binarySearch(mas, 2335);
        PrintResult.printBooleanResult(resultByBinarySearch);

        boolean result1 = IntegerArrayService.binarySearch(mas, 234);
        PrintResult.printBooleanResult(result1);

        int [] fibonacciIntegerArray = FibonacciService.fibonacciNumbers();
        PrintResult.printArray(fibonacciIntegerArray);

        List<Integer> fibonacciList = FibonacciService.fibonacciNumbersFromArray(mas);
        PrintResult.printList(fibonacciList);
    }
}
