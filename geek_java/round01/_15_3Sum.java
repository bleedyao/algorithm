package round01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _15_3Sum {
    public static void main(String[] args) {
        List<List<Integer>> result = threeSum1(new int[]{-2, 0, 1, 1, 2});
        System.out.println(Arrays.toString(result.toArray()));
    }

    // 这中方案没有做完，不符合题目要求，还需要用 hashmap 去重才能完成这道题。
    // 或者使用先排序，再在第三层循环中去重，可实现题目要求。
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 2)
            return result;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        result.add(tmp);
                    }
                }
            }
        }
        return result;
    }

    private static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;
        // 双指针方法，需要先对数组排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 首位大于0，结果一定大于0，跳出循环。
            if (nums[i] > 0) break;
            // 去重
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                } else if (sum < 0) left++;
                else right--;
            }
        }
        return result;
    }
}
