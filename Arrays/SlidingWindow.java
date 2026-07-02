package Arrays;

public class SlidingWindow {
    public static void main(String args[]) {
        int arr[] = { 1000, 150, 20, 25, 30, 40, 50 };
        int k = 3;
        sliding(arr, k);

    }

    static void sliding(int arr[], int k) {

        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for (int j = i; j < k + i; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            System.out.println(max + " ");
        }
    }
}
