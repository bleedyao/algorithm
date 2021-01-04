package round02;

import java.util.Arrays;

import common.SwapInt;

class _283_Move_Zeroes {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 10, 3, 12 };
        move_Zeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void move_Zeroes(int[] arr) {
        if (arr == null)
            return;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                index++;
                continue;
            }

            if (index != 0) {
                SwapInt.swap(arr, i - index, i);
            }
        }
    }
}