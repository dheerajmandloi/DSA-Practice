package Arrays;

import java.util.Arrays;

public class JoinArray {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 7 };
        int arr2[] = { 2, 3, 5 };

        System.out.println(Arrays.toString(merge(arr, arr2)));
    }

    static int[] merge(int arr[], int arr2[]) {
        int length1 = arr.length + arr2.length;
        int arr3[] = new int[length1];
        int j = 0;
        for (int i = 0; i < length1; i++) {
            if (i < arr.length) {
                arr3[i] = arr[i];
            } else {
                arr3[i] = arr2[j];
                j++;
            }
        }
        int min = 0;
        int max = arr3.length - 1;

        while (min < max) {
            int start = 0;
            int end = arr3.length - 1;
            while (start < end) {
                if (arr3[start] > arr3[start + 1]) {
                    int temp = arr3[start];
                    arr3[start] = arr3[start + 1];
                    arr3[start + 1] = temp;
                }
                start++;
            }
            min++;
        }

        return arr3;
    }
}
