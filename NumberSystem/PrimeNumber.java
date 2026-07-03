package NumberSystem;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 25;

        System.out.println(check(num));
    }

    static String check(int num) {

        if (num <= 1) {
            return "NOT PRIME";
        }

        for (int i = 2; i < num; i++) {

            System.out.print(num + " : " + i + "=>" + num % i);
            System.out.println();
            if (num % i == 0) {

                return "NOT PRIME ";
            }
        }

        return "Prime";
    }
}
