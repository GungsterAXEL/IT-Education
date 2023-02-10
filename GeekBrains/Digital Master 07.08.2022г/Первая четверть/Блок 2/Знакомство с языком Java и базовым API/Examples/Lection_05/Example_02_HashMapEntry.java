package Lection_05;

import java.util.HashMap;
import java.util.Map;

public class Example_02_HashMapEntry {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "one");
        db.put(2, "two");
        db.put(3, "three");
        System.out.println(db);
        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}
