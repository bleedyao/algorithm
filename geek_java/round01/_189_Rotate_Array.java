package round01;

import java.util.Arrays;

public class _189_Rotate_Array {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 1);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{-1, -100, 3, 99};
        rotate(nums, 1);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{-1, -100, 3, 99};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{-1};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{-1, 2};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        if (nums == null || k < 1 ) return;
//        for (int i = 0; i < k; i++) {
//            int tmp = nums[nums.length - 1];
//            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
//            nums[0] = tmp;
//        }
        k %= nums.length;
        reverseArray(nums, 0, nums.length);
        reverseArray(nums, 0, k);
        reverseArray(nums, k, nums.length);
    }

    private static void reverseArray(int[] nums, int head, int tail) {
        tail--;
        while (head < tail) {
            int tmp = nums[head];
            nums[head] = nums[tail];
            nums[tail] = tmp;
            head++;
            tail--;
        }
    }
}
