package String;

public class FirstOccurance {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));

    }

    static int strStr(String haystack, String needle) {
        int len = needle.length();

        if (len == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - len; i++) {
            String sub = haystack.substring(i, len + i);
            if (sub.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
