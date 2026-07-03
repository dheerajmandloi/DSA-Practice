package String;

import java.util.LinkedHashMap;

public class CommonChar {
    public static void main(String[] args) {
        String str = "asbodd";
        String str2 = "faddb";

        check(str, str2);
    }

    static void check(String str, String str2) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        char[] name = str.toCharArray();

        for (int i = 0; i < name.length; i++) {
            if (map.containsKey(name[i])) {
                map.put(name[i], map.get(name[i]) + 1);
            } else {
                map.put(name[i], 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {

            char ch = str2.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0) {

                System.out.print(ch);
                map.put(ch, map.get(ch) - 1);
            }
        }

    }
}
