package by.epamtc.task03.service;

import by.epamtc.task03.scan.Scan;
import java.io.IOException;
import java.util.Scanner;

public class StringService {
    private final static String space = " ";

    public static StringBuilder changeWrongLetter(String stringForCheck, String letterForChange) throws IOException {
        Scanner scanner = Scan.readTextFromFile();
        StringBuilder outText = new StringBuilder();
        while (scanner.hasNext()){
            String text = scanner.next();
            StringBuilder sb = new StringBuilder(text);
            int position = sb.indexOf(stringForCheck);
            if((position != -1) && (position != sb.length() - 1)){
                sb.deleteCharAt(position + 1);
                sb.insert(position + 1, letterForChange);
            }
            outText.append(sb.append(space).toString());
        }
        return outText;
    }

    public static StringBuilder deleteWordsStartsWithConsonant(int n) throws IOException {
        Scanner scanner = Scan.readTextFromFile();
        String text;
        StringBuilder outText = new StringBuilder();
        while (scanner.hasNext()){
            text = scanner.next();
            StringBuilder sb = new StringBuilder(text);
            if(text.length() == n){
                if(isVowelLetter(sb.charAt(0))){
                    sb.delete(0, n);
                }
            }
            outText.append(sb.append(space).toString());
        }return outText;
    }

    public static StringBuilder changeWord(int n, String stringForChange) throws IOException {
        Scanner scanner = Scan.readTextFromFile();

        String text;
        StringBuilder outText = new StringBuilder();
        while (scanner.hasNext()){
            text = scanner.next();
            StringBuilder sb = new StringBuilder(text);
            if(text.length() == n){
                sb.delete(0, n);
                sb.append(stringForChange);
            }
            outText.append(sb.append(space).toString());
        }
        return outText;
    }

    public static StringBuilder changeLetter(int n, char letter) throws IOException {
        Scanner scanner = Scan.readTextFromFile();

        String text;
        StringBuilder outText = new StringBuilder();
        while (scanner.hasNext()){
            text = scanner.next();
            StringBuilder sb = new StringBuilder(text);
            if(text.length() >= n){
                sb.setCharAt(n - 1, letter);
            }
            outText.append(sb.append(space).toString());
        }
        return outText;
    }

    public static boolean isVowelLetter(char c) {
        switch (Character.toLowerCase(c)) {
            case 'б':
            case 'в':
            case 'г':
            case 'д':
            case 'ж':
            case 'з':
            case 'й':
            case 'к':
            case 'л':
            case 'м':
            case 'н':
            case 'п':
            case 'р':
            case 'с':
            case 'т':
            case 'ф':
            case 'х':
            case 'ц':
            case 'ч':
            case 'ш':
            case 'щ':
                return true;
            default:
                return false;
        }
    }

}
