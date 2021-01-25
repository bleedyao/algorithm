package round04;

import java.util.Arrays;

public class _26_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1) return 0;
        int singleIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[singleIndex]) {
                singleIndex++;
                nums[singleIndex] = nums[i];
            }
        }
        return singleIndex + 1;
    }
}
