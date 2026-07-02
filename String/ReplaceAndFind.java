package String;

import java.util.Arrays;

public class ReplaceAndFind {
    public static void main(String[] args) {
        String str = "i love java";
        String find = "java";
        String replace = "springboot";

        System.out.println(Arrays.toString(check(str, find, replace)));

    }

    static String[] check(String str, String find, String replace) {
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equalsIgnoreCase(find)) {
                arr[i] = replace;
            }
        }
        return arr;

    }
}