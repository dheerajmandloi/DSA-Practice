package String;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "i love you";

        System.out.println(check(str));
    }

    static String check(String str) {
        String str2 = str.replace(" ", "");

        return str2;
    }
}
