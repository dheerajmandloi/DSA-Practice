package Arrays;

import java.util.Arrays;

public class RotatedLeft {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        System.out.println(Arrays.toString(rotate(arr)));

    }

    static int[] rotate(int arr[]) {
        int start = 0;
        int end = 1;
        for (int i = 0; i < arr.length && end <= arr.length - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end++;
        }
        return arr;
    }

}
