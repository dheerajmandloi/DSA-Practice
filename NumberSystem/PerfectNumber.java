package NumberSystem;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;

        System.out.println(check(num));
    }

    static String check(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = i + sum;
            }
        }

        if (sum == num) {
            return "Perfect  Number";
        }
        return "Not Perfect Number";
    }
}
