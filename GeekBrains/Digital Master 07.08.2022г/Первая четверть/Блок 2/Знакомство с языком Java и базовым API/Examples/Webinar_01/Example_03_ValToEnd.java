package Webinar_01;

/**
 * Дан массив nums = [3,2,1,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному,
 * нужно перенести эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть
 * отличны от заданного,
 * а остальные - равны ему.
 * [2,2,1,3,3]
 */
import java.util.ArrayList;
public class Example_03_ValToEnd {
    public static void main(String[] args) {
        Integer[] nums = { 3, 2, 1, 2, 3 };
        ArrayList<Integer> result = new ArrayList<Integer>();

        int val = 3, count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]!=val){
                result.add(nums[i]);
            }
            else count++;
        }
        for (int i = count; i > 0; i--){
            result.add(val);
        }
        System.out.println(result);
    }
}
