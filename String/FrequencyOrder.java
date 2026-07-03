package String;

import java.util.LinkedHashMap;

public class FrequencyOrder {
    public static void main(String[] args) {
        String str = "dheeraj";

        check(str);
    }

    static void check(String str) {

        char ch[] = str.toCharArray();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < ch.length; i++) {

            if (map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) + 1);
            } else {
                map.put(ch[i], 1);
            }
        }

        for (Character key : map.keySet()) {

            System.out.println(key + "=>" + map.get(key));
        }
    }
}
