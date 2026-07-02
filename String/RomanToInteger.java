package String;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String str = "VIII";

        System.out.println(check(str));
    }

    static int check(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] name = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
            if (map.containsKey(name[i])) {
                if (i < str.length() - 1 && map.get(name[i]) < map.get(name[i + 1])) {
                    sum = sum - map.get(name[i]);
                } else {
                    sum = map.get(name[i]) + sum;

                }
            } else {
                System.out.println("Not Roman");
            }
        }

        return sum;
    }
}
