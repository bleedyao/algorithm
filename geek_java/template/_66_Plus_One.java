package template;

import java.util.Arrays;

public class _66_Plus_One {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits)));

        digits = new int[]{4, 3, 2, 1};
        System.out.println(Arrays.toString(plusOne(digits)));

        digits = new int[]{9};
        System.out.println(Arrays.toString(plusOne(digits)));

    }

    public static int[] plusOne(int[] digits) {
        return digits;
    }
}
