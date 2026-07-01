package Arrays;

public class FrequencyByBF {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 3, 3, 3, 5, 5, 6 };

        check(arr);

    }

    static void check(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + "=>" + count);

        }

    }
}
