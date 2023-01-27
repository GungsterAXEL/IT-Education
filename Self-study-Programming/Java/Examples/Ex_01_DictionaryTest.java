import java.util.HashMap;
import java.util.Map;

public class Ex_01_DictionaryTest {

    public static void main(String[] args) {
        // English to Russian Dictionary
        Map<String, String> engRus = new HashMap<String, String>();

        // добавление элементов
        engRus.put("Monday", "Понедельник");
        engRus.put("Tuesday", "Вторник");
        engRus.put("Wednesday", "Среда");
        engRus.put("Thursday", "Четверг");
        engRus.put("Friday", "Пятница");

        // получение элементов
        System.out.println(engRus.get("Monday"));
        System.out.println(engRus.get("Tuesday"));
        System.out.println(engRus.get("Wednesday"));
        System.out.println(engRus.get("Thursday"));
        System.out.println(engRus.get("Friday"));

        // содержит ли словарь запись с ключом "Wednesday"?
        System.out.println(engRus.containsKey("Wednesday"));

        System.out.println(engRus.keySet());
        System.out.println(engRus.values());

        System.out.println(engRus.size());

        engRus.remove("Monday");

        System.out.println(engRus.toString());
    }

}