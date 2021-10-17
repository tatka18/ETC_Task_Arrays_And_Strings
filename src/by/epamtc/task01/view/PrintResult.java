package by.epamtc.task01.view;

import java.util.List;

public class PrintResult {
    public static void printList(List<Integer> list){
        System.out.println(list.toString());
    }

    public static void printArray(int [] mas){
        for (int element : mas) {
            System.out.print(element + " ");
        }
    }

    public static void printBooleanResult(boolean result){
        System.out.println(result);
    }
}
