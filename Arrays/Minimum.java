package Arrays;

public class Minimum {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 8, 9, -1, -5, 10, 12, 6 };

        System.out.println(check(arr));
    }

    static int check(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
