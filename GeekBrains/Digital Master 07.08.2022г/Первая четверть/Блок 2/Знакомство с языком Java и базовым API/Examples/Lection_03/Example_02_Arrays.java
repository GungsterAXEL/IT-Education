public class Example_02_Arrays {
    static int[] AddItem(int[] array, int item){
        int length = array.length;
        int[]temp = new int[length+1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
    public static void main(String[] args) {
        int[] a = new int[] { 1, 9 };
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length); // Скопировать данные из массива a в массив b с нулевого элемента всю длинну массива a.

        for (int i : a){System.out.printf("%d", i);} // 1 9.
        System.out.println();
        for (int j : b){System.out.printf("%d", j);} // 1 9 0.
        System.out.println();
        
        b = AddItem(b, 9);
        b = AddItem(b, 7);
        for (int i : b){System.out.printf("%d", i);}
    }
}
