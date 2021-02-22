package round02;

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
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
