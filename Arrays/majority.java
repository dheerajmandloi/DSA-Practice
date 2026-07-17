package Arrays;

import java.util.HashMap;

public class majority {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        System.out.println(check(nums));
    }

    static int check(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int max = 0;
        int ans = 0;
        for (Integer key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                ans = key;
            }

        }
        return ans;
    }

}
