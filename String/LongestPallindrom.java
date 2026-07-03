package String;

public class LongestPallindrom {
    public static void main(String arg[]) {
        String str = "babdaadbko";

        // char arr[] = str.toCharArray();

        int max = 0;
        String ans = "";
        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {

                String sub = str.substring(i, j + 1);

                char arr[] = sub.toCharArray();

                int start = 0;
                int end = arr.length - 1;

                while (start < end) {
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;

                    start++;
                    end--;
                }
                String str2 = new String(arr);

                if (str2.equals(sub)) {

                    if (max < sub.length()) {
                        max = sub.length();
                        ans = sub;
                    }
                }

            }

        }
        System.out.println(max);
        System.out.println(ans);

    }
}
