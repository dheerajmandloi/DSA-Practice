package String;

public class Rotate {
    public static void main(String[] args) {
        String str = "abcde";
        String str2 = "cdaeb";

        System.out.println(check(str, str2));
    }

    static boolean check(String str, String str2) {

        if (str.length() != str2.length()) {
            return false;
        }
        String str3 = str + str;

        if (str3.contains(str2)) {
            return true;
        }
        return false;
    }
}
