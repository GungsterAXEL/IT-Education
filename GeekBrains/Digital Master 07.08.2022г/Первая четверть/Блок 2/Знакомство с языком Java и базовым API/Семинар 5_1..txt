import java.util.*;
import java.util.stream.Collectors;

public class Sem4 {

    
    public static void main(String[] args) {
        /* int x = 10;
        int p = x;
        int[] y = new int[]{1,4,6};
        int[] z = y;
        z[1] = 10;
        p = 15;
        int k = y[1];
        System.out.println(p);
        System.out.println(x);
        System.out.println(y[1]);
        System.out.println(z[1]);
        System.out.println(k); */
        
        /* String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        Map<Integer, String> list = new HashMap<>();//по хеш номеру
        for(int i=0; i<3; i++){
            System.out.print("Введите номер и фамилию: ");
            String[] input = iScanner.nextLine().split(" ");
            list.put(Integer.parseInt(input[0]) , input[1]);
        }
        for(var el: list.entrySet()){
            System.out.print(el.getKey() +" : "+ el.getValue() + "\n");
        }
        System.out.println();
        for(var el: list.entrySet()){
            if(el.getValue().equals("Иванов")){
                System.out.print(el.getKey() +" : "+ el.getValue() + "\n");
            }
        }
        iScanner.close(); */
        //System.out.println(FindSkobki());
        SortString();
    }
    public static boolean IsIzomorph(String s1, String s2){
        if(s1.length()!=s2.length())
            return false;
        if(s1.equals(s2)){
            return true;
        }
        Map<Character, Character> sub = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if(sub.containsKey(a) && sub.get(a)!=b)
                return false;
            else{
                sub.put(a, b);
            }
        }
        return true;
    }
    public static boolean FindSkobki(){
        String s1 = "[a+(1*3)]";
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');

        Stack<Character> states = new Stack<>();
        for(int i=0; i<s1.length(); i++){
            char el = s1.charAt(i);
            // если нашли такой ключ
            if(pairs.containsKey(el)){
                //закидываем значение
                states.push(pairs.get(el));
            } 
            //если нашли значение
            else if(pairs.containsValue(el))
                if(states.isEmpty()) 
                    return false;
                else if (el != states.pop())
                    return false;     
        }
         return states.isEmpty();
    }
    public static void SortString(){
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] sMas = s.split(" ");
        System.out.println(sMas.length);
        TreeMap<Double, String> words = new TreeMap<>();
        double p = 0.1;
        for (String string : sMas) {
            
            if (words.containsKey((double)string.length())){
                words.put((double)string.length()+p, string);
                p+=0.1;
            }  
            else
                words.put((double)string.length(), string);
        }
        for (var el : words.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }

        TreeMap<String, Integer> words2 = new TreeMap<>();
        for (String string : sMas) {
            words2.put(string, string.length());
        }
        System.out.println("До сортировки");
        for (var el : words2.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
        
        List<Map.Entry<String, Integer>> list = words2.entrySet().stream()
        .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
        .collect(Collectors.toList());
        System.out.println();
        for (var el : list) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
    }
    
}
