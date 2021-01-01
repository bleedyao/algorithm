package round01;

import java.util.Arrays;

class _283_Move_Zeroes {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 0, 3, 12, 0 };
        // move_Zeroes(arr);
        // move_Zeroes1(arr);
        move_Zeroes2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void move_Zeroes2(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int tmp = arr[index];
                arr[index++] = arr[i];
                arr[i] = tmp;
            }
        }
    }

    private static void move_Zeroes1(int[] arr) {
        for (int i = 0, zeroIdx = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroIdx++;
            } else if (zeroIdx != 0) {
                arr[i - zeroIdx] = arr[i];
                arr[i] = 0;
            }
        }
    }

    private static void move_Zeroes(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                if (i != index) {
                    arr[i] = 0;
                }
                index++;
            }
        }
    }
}