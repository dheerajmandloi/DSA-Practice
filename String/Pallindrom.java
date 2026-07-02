package String;

public class Pallindrom {
    public static void main(String[] args) {
        String str = "madam";

        System.out.println(check(str));
    }

    static String check(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return "Not Pallindrom";
            }

            start++;
            end--;

        }
        return "Pallindrom";
    }
}
