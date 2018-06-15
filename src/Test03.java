import java.util.Arrays;

/**
 * 题目一：找出数组中重复的数字。
 * 在一个长度为 n 的数组中的所有数字都在 0 ~ n-1 的范围内，数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 例如：如果输入长度为 7 的数组 {2，3，1，0，2，5，3} 那么对应的输出是重复的数字 2 或者 3
 */
public class Test03 {
    /**
     * 时间复杂度 O(n) 空间复杂度 O(1)
     */
    public static int checkMulitNumber(int[] nums) {
        int currentIndex = 0;
        int swapIndex = 0;

        while (currentIndex < nums.length) {
            if (nums[currentIndex] < 0 || nums[currentIndex] > nums.length)
                return -1;
            if (currentIndex == nums[currentIndex])
                currentIndex++;
            else {
                swapIndex = nums[currentIndex];
                if (nums[swapIndex] < 0 || nums[swapIndex] > nums.length) {
                    return -1;
                }
                if (swapIndex == nums[swapIndex]) {
                    return swapIndex;
                } else {
                    // 数据交换位置
                    swap(nums, currentIndex, swapIndex);
                }
            }
        }
        return -1;
    }

    public static int repeatDigit(int[] data) {
        if (data == null || data.length == 0)
            return -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0 || data[i] > data.length)
                return -1;
            while (i != data[i]) {
                if (data[data[i]] < 0 || data[data[i]] > data.length)
                    return -1;
                else if (data[i] == data[data[i]])
                    return data[i];
                else
                    swap(data, i, data[i]);
            }
        }
        return -1;
    }

    private static void swap(int[] nums, int currentIndex, int swapIndex) {
        int temp = nums[currentIndex];
        nums[currentIndex] = nums[swapIndex];
        nums[swapIndex] = temp;
    }

    public static void main(String[] args) {
        // 有一个或过个重复的数字
        System.out.println(repeatDigit(new int[]{2, 4, 1, 0, 3, 4, 2}));
        // 没有重复的数字
        System.out.println(repeatDigit(new int[]{5, 3, 0, 1, 2, 4, 6}));
        // 存在超出 0 ~ n-1 范围的数字
        System.out.println(repeatDigit(new int[]{5, 8, 0, 1, 2, 9, 6}));

        //测试用例
        // 有一个或过个重复的数字
//        int result = checkMulitNumber(new int[]{2, 4, 1, 0, 3, 5, 2});
//        // 没有重复的数字
//        int result1 = checkMulitNumber(new int[]{5, 3, 0, 1, 2, 4, 6});
////        // 存在超出 0 ~ n-1 范围的数字
//        int result2 = checkMulitNumber(new int[]{5, 8, 0, 1, 2, 9, 6});
//
//        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(result2);


    }
}
