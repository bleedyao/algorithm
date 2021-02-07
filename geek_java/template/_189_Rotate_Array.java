package template;

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
    }

}
