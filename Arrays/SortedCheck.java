package Arrays;

public class SortedCheck {
    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50 };
        boolean res = check(arr);
        if (!res) {
            System.out.println("Not sorted");
        } else {
            System.out.println("Sorted");
        }
    }

    static boolean check(int arr[]) {

        int end = arr.length - 1;
        int i = 0;
        while (i < end) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
