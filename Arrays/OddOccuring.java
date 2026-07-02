package Arrays;

import java.util.HashMap;

public class OddOccuring {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 3, 5, 5, 6, 6, 8, 7, 7, 7, 7, 7, 7 };

        System.out.println((check(arr)));
    }

    static int check(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                return key;
            }
        }
        return -1;
    }

}
