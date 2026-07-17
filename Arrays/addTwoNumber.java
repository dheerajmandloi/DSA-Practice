package Arrays;

import java.util.Arrays;

public class addTwoNumber {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 3 };
        int arr2[] = { 5, 6, 4 };

        System.out.println(Arrays.toString(check(arr, arr2)));

    }

    static int[] check(int arr[], int arr2[]) {

        long num = 0;
        long digit = 0;
        long rev = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        while (num != 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        long num2 = 0;

        for (int i = 0; i < arr2.length; i++) {
            num2 = num2 * 10 + arr2[i];
        }
        long rev2 = 0;

        while (num2 != 0) {
            digit = num2 % 10;
            rev2 = rev2 * 10 + digit;
            num2 = num2 / 10;
        }

        long total = rev + rev2;

        String str = String.valueOf(total);

        int newarr[] = new int[str.length()];
        int j = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            newarr[j] = str.charAt(i) - '0';
            j++;
        }

        return newarr;
    }

}
