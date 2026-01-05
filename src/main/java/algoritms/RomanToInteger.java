package algoritms;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int result = result(map, s);
        System.out.println(result);
    }

    private static int result(HashMap<String, Integer> map, String s) {
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(String.valueOf(s.charAt(i)));
            if (i + 1 < s.length()) {
                int next = map.get(String.valueOf(s.charAt(i + 1)));
                if (current < next) {
                    value -= current;
                } else {
                    value += current;
                }
            } else {
                value += current;
            }
        }
        return value;
    }
}
