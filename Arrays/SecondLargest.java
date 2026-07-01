package Arrays;

public class SecondLargest {
    public static void main(String args[]) {
        int arr[] = { 12, 45, 7, 89, 56, 78 };

        System.out.println(largest(arr));

    }

    static int largest(int arr[]) {
        int largest = 0;
        int SecLarge = 0;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                SecLarge = largest;
                largest = arr[i];

            } else if (arr[i] > SecLarge && arr[i] != largest) {
                SecLarge = arr[i];
            }

        }
        return SecLarge;
    }
}
