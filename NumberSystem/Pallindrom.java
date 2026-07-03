package NumberSystem;

public class Pallindrom {
    public static void main(String[] args) {
        int num = 121;

        System.out.println(check(num));
    }

    static String check(int num) {
        int dummynum = num;
        int digit = 0;
        int rev = 0;
        while (num != 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (dummynum == rev) {
            return "Pallindrom";
        }
        return "Not pallindrom";
    }
}
