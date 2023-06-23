package Examples.Webinar_03.Homework;

import Examples.Webinar_03.Homework.Entry.Entry;
import Examples.Webinar_03.Homework.Entry.EntryMaker;
import Examples.Webinar_03.Homework.Entry.EntryWriter;
import Examples.Webinar_03.Homework.Entry.InputChecker;
import Examples.Webinar_03.Homework.Exceptions.WrongFormatException;

import java.text.ParseException;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;

public class Terminal {
    private static Terminal terminal;
    private InputChecker checker;
    private EntryMaker maker;
    private EntryWriter writer;

    public Terminal(InputChecker checker, EntryMaker maker, EntryWriter writer) {
        this.checker = checker;
        this.maker = maker;
        this.writer = writer;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = checker.checkLine(scanner);
            if (input == null || input.equals(null)) break;
            else {
                try {
                    Entry inputEntry = maker.makeEntry(List.of(input.split(" ")));
                    writer.writeToFile(inputEntry);
                } catch (ParseException | WrongFormatException | NullPointerException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                } catch (IOException e) {
                    System.out.println("Ошибка при создании файла.");
                    e.printStackTrace();
                }
            }
        }
        scanner.close();
    }
}