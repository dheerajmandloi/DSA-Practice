package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String args[]) {
        int arr[] = { 10, 15, 20, 25, 30, 40, 50 };

        System.out.println(Arrays.toString(reverse(arr)));

    }

    static int[] reverse(int arr[]) {
        int start = 0;
        int temp = 0;
        int end = arr.length - 1;

        while (start < end) {

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        return arr;
    }

}
