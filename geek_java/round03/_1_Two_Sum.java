package round03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        nums = twoSum(nums, 9);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
