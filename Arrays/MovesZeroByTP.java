package Arrays;

import java.util.Arrays;

public class MovesZeroByTP {
    public static void main(String args[]) {
        int arr[] = { 1, 0, 2, 0, 3, 4, 0 };

        System.out.println(Arrays.toString(moves(arr)));

    }

    static int[] moves(int arr[]) {
        int start = 0;
        int pointer = 1;
        int end = arr.length - 1;

        while (start < end && pointer <= end) {
            if (arr[start] == 0 && arr[pointer] == 0) {
                pointer++;
            } else if (arr[start] != 0 && arr[pointer] == 0) {
                start++;
                pointer = start + 1;
            } else if (arr[start] == 0 && arr[pointer] != 0) {
                int temp = arr[start];
                arr[start] = arr[pointer];
                arr[pointer] = temp;
                start++;
                pointer = start + 1;
            } else {
                start++;
                pointer++;
            }
        }
        return arr;
    }
}
