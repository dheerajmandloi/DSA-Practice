package String;

public class LargestOdd {
    public static void main(String[] args) {
        String str = "40698";

        check(str);
    }

    static void check(String str) {
        char arr[] = str.toCharArray();

        int arr2[] = new int[arr.length];
        int index = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] - '0';
            if (arr2[i] % 2 != 0) {
                index = i;
                count++;
            }
        }
        if (count != 0) {
            for (int i = 0; i < index + 1; i++) {
                System.out.print(arr[i]);
            }
        } else {
            System.out.println(" No found ");
        }

    }
}
