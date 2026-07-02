package String;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String str = "aab";
        String str2 = "abb";

        System.out.println(check(str, str2));
    }

    static String check(String str, String str2) {

        if (str.length() != str2.length()) {
            return "Not Anagram";
        }

        HashMap<Character, Integer> map = new HashMap<>();
        char name[] = str.toCharArray();
        char name2[] = str2.toCharArray();

        for (int i = 0; i < name.length; i++) {
            if (map.containsKey(name[i])) {
                map.put(name[i], map.get(name[i]) + 1);
            } else {
                map.put(name[i], 1);
            }
        }

        for (int i = 0; i < name2.length; i++) {
            if (!map.containsKey(name2[i])) {
                return "Not Anagram";
            }
            map.put(name2[i], map.get(name2[i]) - 1);

            if (map.get(name2[i]) < 0) {
                return "Not Anagram";
            }
        }

        for (int value : map.values()) {
            if (value != 0) {
                return "Not Anagram";
            }
        }
        return "Anagram";
    }
}
