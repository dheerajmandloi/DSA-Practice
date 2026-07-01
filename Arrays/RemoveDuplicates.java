package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 3, 3, 3, 5, 5, 6 };

        System.out.println(Arrays.toString(check(arr)));

    }

    static int[] check(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int arr2[] = new int[arr.length];
        int j = 0;
        while (start < end) {
            if (arr[start] == arr[start + 1]) {
                arr2[j] = arr[start];
                j++;
            } else {

            }
            start++;
        }
        return arr2;
    }
}
