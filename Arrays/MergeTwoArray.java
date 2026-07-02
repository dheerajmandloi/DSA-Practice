package Arrays;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 7 };
        int arr2[] = { 2, 3, 5 };

        System.out.println(Arrays.toString(merge(arr, arr2)));
    }

    static int[] merge(int arr[], int arr2[]) {
        int len = arr.length + arr2.length;
        int arr3[] = new int[len];
        int j = 0;
        int k = 0;
        int i = 0;
        while (i < arr.length && j < arr2.length) {
            if (arr[i] <= arr2[j]) {
                arr3[k] = arr[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < arr.length) {
            arr3[k] = arr[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }
}