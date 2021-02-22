package template;

import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));

        num1 = new int[]{1};
        num2 = new int[]{};
        merge(num1, 1, num2, 0);
        System.out.println(Arrays.toString(num1));


        num1 = new int[]{0};
        num2 = new int[]{1};
        merge(num1, 0, num2, 1);
        System.out.println(Arrays.toString(num1));

        num1 = new int[]{2, 0};
        num2 = new int[]{1};
        merge(num1, 1, num2, 1);
        System.out.println(Arrays.toString(num1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    }
}
