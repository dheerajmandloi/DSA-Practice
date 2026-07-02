package Arrays;

public class Maximum {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 8, 9, 4, 12, 6 };

        System.out.println(check(arr));
    }

    static int check(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
