package by.epamtc.task03.run;

import by.epamtc.task03.service.StringService;
import by.epamtc.task03.service.StringServiceWithRegex;
import by.epamtc.task03.view.PrintResult;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        PrintResult.printChangedText(StringService.changeLetter( 5, 'D'));

        PrintResult.printChangedText(StringService.changeWord(9, "Zagagulina"));

        PrintResult.printChangedText(StringService.deleteWordsStartsWithConsonant(7));

        PrintResult.printChangedText(StringService.changeWrongLetter("ро", "А"));

        ////////////////////////WITH REGEX

        PrintResult.printChangedText(StringServiceWithRegex.changeLetter(6, 'Й'));

        PrintResult.printChangedText(StringServiceWithRegex.deleteWhatIsNotLetterAndSpace());

        PrintResult.printChangedText(StringServiceWithRegex.changeWrongLetter("String", "A"));

        PrintResult.printChangedText(StringServiceWithRegex.changeWord(5, "Gaagovich"));

        PrintResult.printChangedText(StringServiceWithRegex.deleteWordsStartsWithConsonant(5));
    }
}
