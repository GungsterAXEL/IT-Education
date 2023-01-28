import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Задача 2.1.
 * Заполнить список названиями планет Солнечной системы
 * в произвольном порядке с повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 */

public class Example_02_SolarSystem {
    public static void main(String[] args) {
        Random random = new Random();
        int randomLength = random.nextInt(8, 25);
        List<String> solarList = new ArrayList<>();
        String[] solarArray = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон" };
        for (int i = 0; i < randomLength; i++) {
            int randomPlanet = random.nextInt(solarArray.length);
            solarList.add(solarArray[randomPlanet]);
        }
        for (String item : solarList) {
            System.out.print(item + " ");
        }
        
        System.out.println();

        for(String item : solarList){
            int count = 0;
            for(String iten : solarList){
                if(item.equals(iten)){
                    count++;
                }
            }
            System.out.println(item+" "+count);
        }
    }
}
