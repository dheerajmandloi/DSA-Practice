package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 22;

        check(arr, target);

    }

    static void check(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int compliment = target - arr[i];

            if (map.containsKey(compliment)) {
                System.out.println(map.get(compliment) + "," + i);
                return;
            }
            map.put(arr[i], i);
        }

        System.out.println("no pair found");
    }
}
