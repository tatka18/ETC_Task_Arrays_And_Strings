package by.epamtc.task03.service;

import by.epamtc.task03.scan.Scan;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringServiceWithRegex {
    private final static String space = " ";

    public static StringBuilder deleteWordsStartsWithConsonant(int n) throws IOException {
        Scanner scanner = Scan.readTextFromFile();
        String text;
        StringBuilder outText = new StringBuilder();

        String stringPattern = "\\b[^уеыаоэюияУЕЫАОЭЮИЯ-].{" + (n - 1) + "}\\b";
        Pattern pattern = Pattern.compile(stringPattern);
        while (scanner.hasNext()){
            text = scanner.next();
            Matcher matcher = pattern.matcher(text);
            StringBuilder sb = new StringBuilder(text);
            while (matcher.find()){
                sb.delete(0, n);
            }
            outText.append(sb.append(space).toString());
        }
        return outText;
    }

    public static StringBuilder changeWord(int n, String stringForChange) throws IOException {
        Scanner scanner = Scan.readTextFromFile();
        String text;
        StringBuilder outText = new StringBuilder();

        String stringPattern = "\\b[А-Яа-я].{" + (n - 1) + "}\\b";
        Pattern pattern = Pattern.compile(stringPattern);
        while (scanner.hasNext()){
            text = scanner.next();
            Matcher matcher = pattern.matcher(text);
            StringBuilder sb = new StringBuilder(text);
            while (matcher.find()){
                sb.delete(0, n)
                        .insert(0, stringForChange);
            }
            outText.append(sb.append(space).toString());
        }
        return outText;
    }

    public static StringBuilder changeLetter(int n, char letter) throws IOException {
        Scanner scanner = Scan.readTextFromFile();
        String text;

        String stringPattern = "(\\W{" + n + ",})";
        Pattern pattern = Pattern.compile(stringPattern);

        StringBuilder outText = new StringBuilder();
        while (scanner.hasNext()){
            text = scanner.next();
            Matcher matcher = pattern.matcher(text);
            StringBuilder sb = new StringBuilder(text);

            while (matcher.find()){
                if(matcher.matches()){
                    sb.setCharAt(n - 1, letter);
                }
            }outText.append(sb.append(space).toString());
        }
        return outText;
    }

    public static StringBuilder changeWrongLetter(String stringForCheck, String letterForChange) throws IOException {
        Scanner scanner = Scan.readTextFromFile();
        StringBuilder outText = new StringBuilder();
        String text;

        String patternString = "[Рр][о]";
        Pattern pattern = Pattern.compile(patternString);

        while (scanner.hasNext()){
            text = scanner.next();
            Matcher matcher = pattern.matcher(text);
            StringBuilder sb = new StringBuilder(text);

            while (matcher.find()){
                int index = sb.indexOf(matcher.group());
                sb.deleteCharAt(sb.indexOf(matcher.group()) + 1)
                        .insert(index + 1, letterForChange);
            }
            outText.append(sb.append(space).toString());
        }
        return outText;
    }

    public static StringBuilder deleteWhatIsNotLetterAndSpace() throws IOException {
        Scanner scanner = Scan.readTextFromFile();
        StringBuilder outText = new StringBuilder();
        String text;

        String stringPattern = "[^А-Яа-я\\s]";
        Pattern pattern = Pattern.compile(stringPattern);

        while (scanner.hasNext()){
            text = scanner.next();
            Matcher matcher = pattern.matcher(text);
            StringBuilder sb = new StringBuilder(text);

            while (matcher.find()){
                sb.deleteCharAt(sb.indexOf(matcher.group()));
            }
            outText.append(sb.append(space).toString());
        }
        return outText;
    }
}
