package Arrays;

import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.println(check(num));
    }

    static int check(int num) {
        int res = num * (num - 1) / 2;
        return res;
    }
}
