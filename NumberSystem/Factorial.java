package NumberSystem;

public class Factorial {
    public static void main(String[] args) {
        int num = 145;

        System.out.println(check(num));
    }

    static String check(int num) {

        int fac = 1;
        int sum = 0;
        int dummynum = num;
        while (num != 0) {
            int digit = num % 10;

            for (int i = 1; i <= digit; i++) {
                fac = fac * i;
            }
            sum = sum + fac;
            num = num / 10;
            fac = 1;

        }

        if (sum == dummynum) {
            return "Strong number";
        }
        return "Not Strong Number";
    }
}
