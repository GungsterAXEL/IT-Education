import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Задача 4.
 * Каталог товаров книжного магазина сохранен в виде двумерного списка
 * List<ArrayList<String>> так,
 * что на 0й позиции каждого внутреннего списка содержится название жанра,
 * а на остальных позициях - названия книг.
 * Напишите метод для заполнения данной структуры.
 */

public class Example_04_CatalogFiller {
    public static List<ArrayList<String>> CatalogFiller(List<ArrayList<String>> booksCatalog, String[] bookJenre) {

        if (booksCatalog.isEmpty()) {
            booksCatalog.add(new ArrayList<>(Arrays.asList(bookJenre)));
        } else {
            for (int i = 0; i < booksCatalog.size(); i++) {
                if (!booksCatalog.get(i).get(0).equals(bookJenre[0])) {
                    booksCatalog.add(new ArrayList<>(Arrays.asList(bookJenre)));
                }
            }
        }
        return booksCatalog;
    }

    public static void main(String[] args) {
        String[] fantasy = { "Фэнтези", "Разрушенный трон", "Врата. Выжженная земля", "Доктор Шифр",
                "А что бы сделал ты?", "Мудрый путник" };
        String[] fantastic = { "Фантастика", "Ньют, нарушитель законов физики", "Космический наемник",
                "Церера. Сияние полуночного золота", "Северный щит", "Ошибка, которую не исправить" };
        String[] adventure = { "Приключения", "Автомеханик", "Путешествие с риском для жизни", "Секреты Родни Длаба",
                "Метро. Белокурая незнакомка. 15-е число", "Первородный хаоса" };

        List<ArrayList<String>> booksCatalog = new ArrayList<>();

        booksCatalog = CatalogFiller(booksCatalog, fantasy);
        booksCatalog = CatalogFiller(booksCatalog, fantastic);
        booksCatalog = CatalogFiller(booksCatalog, adventure);

        for (List<String> jenre : booksCatalog) {
            System.out.println(jenre);
        }
    }
}
