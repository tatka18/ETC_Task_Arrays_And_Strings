package by.epamtc.task03.run;

import by.epamtc.task03.scan.Scan;
import by.epamtc.task03.view.PrintResult;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> integerList = Scan.readListFromTextFile();
        PrintResult.printListFromFile(integerList);

    }
}
