package NumberSystem;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;

        System.out.println(check(num));
    }

    static boolean check(int num) {
        int digit = 0;
        int cube = 0;
        int dummynum = num;
        int sum = 0;
        while (num != 0) {
            digit = num % 10;
            cube = digit * digit * digit;
            sum = cube + sum;
            num = num / 10;
        }

        if (sum != dummynum) {
            return false;
        }
        return true;

    }
}
