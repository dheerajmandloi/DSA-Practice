package String;

import java.util.LinkedHashMap;

public class FrequencyChar {
    public static void main(String[] args) {
        String str = "dheeraj";

        check(str);
    }

    static void check(String str) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        char[] name = str.toCharArray();

        for (int i = 0; i < name.length; i++) {
            if (map.containsKey(name[i])) {
                map.put(name[i], map.get(name[i]) + 1);
            } else {
                map.put(name[i], 1);
            }
        }

        for (Character key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
