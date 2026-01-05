package algoritms;

import java.util.*;

public class IntegerToRoman {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        int input = 58;
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
//        List<Integer> list = map.keySet().stream().toList();
        LinkedList<Integer> list = new LinkedList<>(map.keySet());
        list.sort(Collections.reverseOrder());
        System.out.println(list);
        String result = result(map, input,list);
        System.out.println(result);
    }

    private static String result(TreeMap<Integer, String> map, int number, List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            while (number >= list.get(i)) {
                number -= list.get(i);
                sb.append(map.get(list.get(i)));
            }
        }
        return sb.toString();
    }
}
