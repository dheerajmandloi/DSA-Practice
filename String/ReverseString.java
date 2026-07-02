package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "i love you";

        System.out.println(check(str));
    }

    static String check(String str) {
        String arr[] = str.split(" ");
        int end = arr.length - 1;
        int start = 0;
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        String ans = String.join(" ", arr);

        return ans;
    }
}
