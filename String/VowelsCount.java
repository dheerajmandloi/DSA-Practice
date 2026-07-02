package String;

public class VowelsCount {

    public static void main(String[] args) {
        String str = "helloei";

        System.out.println(check(str));
    }

    static int check(String str) {
        char arr[] = str.toCharArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {

                sum = sum + 1;
            }
        }
        return sum;
    }

}
