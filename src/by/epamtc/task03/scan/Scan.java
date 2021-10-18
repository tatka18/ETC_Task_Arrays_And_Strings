package by.epamtc.task03.scan;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Scan {
    public static Scanner readTextFromFile() throws IOException {
        String fileName = "C:\\Folder for HD\\Studying\\Code Projects\\ETC_Task3_Arrays_And_Strings\\src\\by\\epamtc\\util\\text";
        Path path = Paths.get(fileName);
        return new Scanner(path);
    }
}
