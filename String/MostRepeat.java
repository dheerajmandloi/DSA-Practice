package String;

import java.util.LinkedHashMap;

public class MostRepeat {
    public static void main(String[] args) {
        String str = "dheeraaj";

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

        int max = 0;
        for (int i = 0; i < name.length; i++) {

            if (max < map.get(name[i])) {
                max = map.get(name[i]);
            }
            // System.out.println(map.get(name[i]));
        }
        for (Character key : map.keySet()) {

            if (map.get(key) == max) {
                System.out.println(key);
                System.out.println("Frequecy:" + map.get(key));
            }
        }

    }
}
