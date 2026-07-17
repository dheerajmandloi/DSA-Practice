package Arrays;

public class SearchInserted {
    public static void main(String[] args) {
        int arr[] = { 3, 8, 15 };
        int target = 12;

        System.out.println(check(arr, target));
    }

    static int check(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

            if (arr[i] > target) {
                return i;
            }
        }

        return arr.length;
    }

}
