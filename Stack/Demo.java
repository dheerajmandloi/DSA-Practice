package Stack;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        String str = "((({})))";

        System.out.println(check(str));
    }

    static String check(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length() / 2; i++) {
            char ch = str.charAt(i);
            st.push(ch);
        }
        for (int i = 0; i < str.length() / 2; i++) {
            char ch = str.charAt(i);
            st.pop();
        }

    }
}
