import java.util.HashMap;
import java.util.Map;

public class Example_01_HashMap {
    public static void main(String[] args) {
        Map<Integer,String>db=new HashMap<>();
        db.putIfAbsent(1, "один"); // Добавить значение с проверкой по ключу. Если такой ключ существует, то добавление не произведётся. А если существует, то элемент добавится.
        db.put(2,"два"); // Добавить значение по ключу. Если такой ключ уже существует, то значение перезапишется.
        db.put(null,"null"); // Добавление по ключу null тоже возможно.
        System.out.println(db); // {0=null, null=null, 2=два}.
        System.out.println(db.get(44)); // Выведет null, т.к. такого ключа ещё нет в db.
        db.remove(null); // Удаление элемента по ключу.
        System.out.println(db); // {1=один, 2=два}.
        System.out.println(db.containsValue("один")); // Выведет true или false в зависимости от того есть такое значение в db или нет.
        System.out.println(db.containsValue(1)); // false. Проверка по значению.
        System.out.println(db.containsKey("один")); // false. Проверка по ключу.
        System.out.println(db.containsKey(1)); // true. Проверка по ключу.
        System.out.println(db.keySet()); // Вывод набора ключей коллекции без значений.
        System.out.println(db.values()); // Вывод набора значений без ключей.
    }
}
