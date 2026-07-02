package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String arr[] = { "flower", "flow", "flight" };

        System.out.println(check(arr));
    }

    static String check(String arr[]) {

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }

        return prefix;
    }
}
