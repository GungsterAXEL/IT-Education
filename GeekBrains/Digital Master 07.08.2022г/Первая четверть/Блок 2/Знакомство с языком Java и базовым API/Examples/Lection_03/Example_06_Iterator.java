import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example_06_Iterator {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,12,123,1234,12345);

        for(int item:list){ // foreach цикл.
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator(); // Обобщения (Integer) должны совпадать у итератора и обращаемого списка.
        System.out.println();

        while(col.hasNext()){ // Пока в col есть следующий элемент.
            System.out.println(col.next());
            // col.next(); // Exception in thread "main" java.util.NoSuchElementException. col.next() дважды делать не надо.
            // col.remove(); // Exception in thread "main" java.lang.UnsupportedOperationException
        }
        System.out.println(col);

    }
}
