package String;

public class Reverse {
    public static void main(String[] args) {
        String str = "naina";

        System.out.println(check(str));
    }

    static String check(String str) {
        int start = 0;
        int end = str.length() - 1;

        char[] name = str.toCharArray();

        while (start <= end) {

            char temp = name[start];
            name[start] = name[end];
            name[end] = temp;

            start++;
            end--;

        }
        return new String(name);
    }
}
