package Lection_05;

import java.util.HashMap;
import java.util.Map;

public class Example_03_HashMapBoost {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>(9); // Указать вместимость.
        Map<Integer, String> map3 = new HashMap<>(9, 1.0f); // Указать вместимость и фактор загрузки до увеличения.
    }
}
