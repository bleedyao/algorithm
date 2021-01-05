package round02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_3Sum {
    public static void main(String[] args) {
        List<List<Integer>> result = threeSum1(new int[]{-2, 0, 1, 1, 2});
        System.out.println(Arrays.toString(result.toArray()));
    }

    private static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (sum < 0) l++;
                else r--;
            }
        }
        return result;
    }
}
