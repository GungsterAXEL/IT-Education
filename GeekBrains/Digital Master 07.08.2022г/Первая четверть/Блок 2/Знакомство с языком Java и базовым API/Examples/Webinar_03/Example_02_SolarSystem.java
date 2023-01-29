import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Задача 2.1.
 * Заполнить список названиями планет Солнечной системы
 * в произвольном порядке с повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 * 
 * Задача 2.2 (если выполнено первое задание)
 * Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */

public class Example_02_SolarSystem {
    public static void main(String[] args) {
        Random random = new Random();
        int randomLength = random.nextInt(8, 40);

        List<String> solarList = new ArrayList<>();
        List<String> solarList2 = new ArrayList<>();

        String[] solarArray = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон" };

        for (int i = 0; i < randomLength; i++) {
            int randomPlanet = random.nextInt(solarArray.length);
            solarList.add(solarArray[randomPlanet]);
        }

        System.out.println("\n" + solarList + "\n");

        // Вариант без сортировки.
        // for (String item : solarList) {
        // int count = 0;
        // for (String iten : solarList) {
        // if (item.equals(iten))
        // count++;
        // }
        // if (count >= 1)
        // solarList2.add(item);
        // System.out.println(count + " " + item);
        // }

        // Вариант с сортировкой.
        solarList.sort(null);
        int count = 1;
        for (int i = 0; i < solarList.size() - 1; i++) {
            if (!solarList.get(i).equals(solarList.get(i + 1))) {
                System.out.println(count + " " + solarList.get(i));
                count = 1;
                solarList2.add(solarList.get(i));
            } else
                count++;
        }
        System.out.println("\n" + solarList2 + "\n");
    }
}
