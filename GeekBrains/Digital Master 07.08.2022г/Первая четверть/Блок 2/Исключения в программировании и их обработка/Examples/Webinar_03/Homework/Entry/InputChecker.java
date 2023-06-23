package Examples.Webinar_03.Homework.Entry;

import java.util.List;
import java.util.Scanner;

public class InputChecker {
    private final String INPUT_MESSAGE = "Для справки по форматам введите 'Help', для выхода 'Q'.\n" +
            "Введите данные через пробел (Ф И О DD.MM.YYYY phone-number gender): ",
            LOW_QUANTITY_ERROR = "Недостаточно данных для внесения записи!",
            AVERAGE_QUANTITY_ERROR = "Слишком много данных для записи!",
            EXIT_COMMAND = "Q",
            EXIT_MESSAGE = "Всего хорошего!",
            HELP_COMMAND = "Help",
            HELP_MESSAGE = "Форматы данных:\n" +
                    "    Фамилия, Имя, Отчество - строки\n" +
                    "    Дата рождения - строка формата DD.MM.YYYY\n" +
                    "    Номер телефона - целое беззнаковое число без форматирования\n" +
                    "    Пол - символ латиницей F или M.";

    private final int MAX_QUANTITY = 6;

    public String checkLine(Scanner scanner) {
        System.out.println(INPUT_MESSAGE);
        String input = cleanSpace(scanner.nextLine());
        if (input.equals(EXIT_COMMAND)) {
            System.out.println(EXIT_MESSAGE);
            return null;
        } else if (input.equals(HELP_COMMAND)) {
            System.out.println(HELP_MESSAGE);
        } else {
            int quantity = checkDataQuantity(input);
            if (quantity == -1)
                System.out.println(LOW_QUANTITY_ERROR);
            else if (quantity == -2) {
                System.out.println(AVERAGE_QUANTITY_ERROR);
            }
        }
        return input;
    }

    private String cleanSpace(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    private int checkDataQuantity(String input) {
        List<String> inputList = List.of(input.trim().split(" "));
        if (checkInput(input) || inputList.size() < MAX_QUANTITY) return -1;
        else if (inputList.size() > MAX_QUANTITY) return -2;
        return 0;
    }

    private boolean checkInput(String input) {
        if (input.isEmpty()) return true;
        return false;
    }
}
