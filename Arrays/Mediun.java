package Arrays;

import java.util.Arrays;

public class Mediun {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };

        System.out.println((check(arr)));

    }

    static double check(int arr[]) {

        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
        }
        return arr[arr.length / 2];

    }
}