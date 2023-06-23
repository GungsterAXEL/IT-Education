package Examples.Webinar_03.Homework.Entry;

import Examples.Webinar_03.Homework.Exceptions.WrongFormatException;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntryMaker {
    private final String DATE_PATTERN = "^\\d{2}\\.\\d{2}\\.\\d{4}$";
    private final String DATE_FORMAT = "dd.MM.yyyy";
    private final Character GENDER_F = 'F';
    private final Character GENDER_M = 'M';

    public Entry makeEntry(List<String> inputList) throws ParseException, WrongFormatException, NullPointerException {
        Entry newEntry = new Entry();
        for (String field : inputList) {
            newEntry = checkEntry(newEntry, field);
        }
        if (!nullEntryChecker(newEntry)) throw new NullPointerException("Пустые значения использовать нельзя!");
        return newEntry;
    }

    private Entry checkEntry(Entry newEntry, String field) throws ParseException, WrongFormatException {
        if (validDate(field, DATE_PATTERN)) {
            newEntry.setDateFormat(DATE_FORMAT);
            newEntry.setBirthday(new SimpleDateFormat(DATE_FORMAT).parse(field));
        } else if (field.matches("\\d+")) newEntry.setPhone(new BigInteger(field));
        else if (field.equals(Character.toString(GENDER_F)) || field.equals(Character.toString(GENDER_M)))
            newEntry.setGender(field.charAt(0));
        else if (newEntry.getSurname() == null) newEntry.setSurname(field);
        else if (newEntry.getName() == null) newEntry.setName(field);
        else if (newEntry.getPatronymic() == null) newEntry.setPatronymic(field);
        else throw new WrongFormatException("Неверный формат записи: " + field + ".");
        return newEntry;
    }

    private boolean nullEntryChecker(Entry entry) {
        if (entry.getSurname() == null ||
                entry.getName() == null ||
                entry.getPatronymic() == null ||
                entry.getBirthday() == null ||
                entry.getPhone() == null ||
                entry.getGender() == null) return false;
        return true;
    }

    private List<String> parseInput(String input) {
        return List.of(input.split(" "));
    }

    private boolean validDate(String date, String dateFormat) {
        Pattern datePattern = Pattern.compile(dateFormat);
        Matcher matcher = datePattern.matcher(date);
        return matcher.matches();
    }
}
