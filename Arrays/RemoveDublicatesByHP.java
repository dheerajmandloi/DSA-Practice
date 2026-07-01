package Arrays;

import java.util.HashSet;

public class RemoveDublicatesByHP {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 3, 3, 3, 5, 5, 6 };

        check(arr);

    }

    static void check(int arr[]) {

        HashSet<Integer> map = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            map.add(arr[i]);
        }

        System.out.println(map);

    }
}
