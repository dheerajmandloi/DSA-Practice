package Arrays;

public class LargestElement {
    public static void main(String args[]) {
        int arr[] = { 12, 45, 7, 89, 34, 56 };

        System.out.println(arr[largest(arr)]);

    }

    static int largest(int arr[]) {
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[start] < arr[i]) {
                start = i;
            }
        }
        return start;
    }
}
