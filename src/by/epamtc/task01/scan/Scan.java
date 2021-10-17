package by.epamtc.task01.scan;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scan {
    public static List<Integer> readListFromTextFile() throws IOException {
        String fileName = "C:\\Folder for HD\\Studying\\Code Projects\\ETC_Task3_Arrays_And_Strings\\src\\by\\epamtc\\util\\numbers";
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);

        List<Integer> integerList = new ArrayList<>();
        while ((scanner.hasNext())){
            integerList.add(scanner.nextInt());
        }
        return integerList;
    }
}
