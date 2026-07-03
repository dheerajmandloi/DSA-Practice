package String;

import java.util.LinkedHashMap;

public class NonRepeating {
    public static void main(String[] args) {
        String str = "aabbcddeff";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        char arr[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Character key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
                break;
            }
        }
    }
}
