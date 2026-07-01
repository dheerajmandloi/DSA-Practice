package Arrays;

public class FindMissing {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 8, 6, 3, 4 };
        System.out.println(check(arr));
    }

    static int check(int arr[]) {
        int num = arr.length + 1;
        int res = 0;

        int expsum = num * (num + 1) / 2;
        int arraysum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraysum = arr[i] + arraysum;
        }

        res = expsum - arraysum;

        return res;
    }

}
