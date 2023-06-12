package Examples.Webinar_04;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int test = 10;

        for (int i = 0; i < 50; i++) {
            hashmap.put(i, new Random().nextInt());
        }

        System.out.println("Текущий размер hashmap: " + hashmap.size());
        System.out.println("Get(Key = " + test + "): " + hashmap.get(test));
        System.out.println("Remove(Key = " + test + "): " + hashmap.remove(test));
        System.out.println("Get(Key = " + test + "): " + hashmap.get(test));
        System.out.println("Текущий размер hashmap: " + hashmap.size());
        System.out.println("Put(Key = " + test + ", Value = Random): " + hashmap.put(test, new Random().nextInt()));
        System.out.println("Replace(Key = " + test + ", Value = " + test + "): " + hashmap.replace(test, test));
        System.out.println("Get(Key = " + test + "): " + hashmap.get(test));
        System.out.println("ContainsKey(" + test + "): " + hashmap.containsKey(test));
        System.out.println("ContainsKey(" + (test * test) + "): " + hashmap.containsKey(test * test));
        System.out.println("ContainsValue(" + test + "): " + hashmap.containsValue(test));
        System.out.println("ContainsValue(" + (test * test) + "): " + hashmap.containsValue(test * test));
        System.out.println("Текущий размер hashmap: " + hashmap.size());
    }
}
