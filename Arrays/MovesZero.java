package Arrays;

import java.util.Arrays;

public class MovesZero {
    public static void main(String args[]) {
        int arr[] = { 1, 0, 2, 0, 3, 4, 0 };

        System.out.println(Arrays.toString(moves(arr)));

    }

    static int[] moves(int arr[]) {
        int arr2[] = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr2[j] = arr[i];
                j++;
            }
        }

        return arr2;
    }
}
