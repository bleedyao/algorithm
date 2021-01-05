package round04;

import java.util.Arrays;

class _283_Move_Zeroes {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 10, 3, 12, 0, 2, 0, 4, 6 };
        move_Zeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void move_Zeroes(int[] arr) {
        if (arr == null || arr.length < 1)
            return;
        // zeroIndex 表示 0 的个数
        int zeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroIndex++;
            } else if (zeroIndex != 0) {
                arr[i - zeroIndex] = arr[i];
                arr[i] = 0;
            }
        }
    }
}
