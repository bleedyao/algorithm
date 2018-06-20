import java.util.Arrays;
import java.util.Random;

/**
 * 有一组 N 个数，确定其中第 k 个最大值
 */
public class Demo01 {
    /**
     * 纯冒泡排序
     */
    private static int selectK01(int[] arr, int k) {
        if (k < 1 || k > arr.length) {
            return -1;
        }
        bubbleSort(arr);
        System.out.println("sorted: " + Arrays.toString(arr));
        return arr[k - 1];
    }

    /**
     * 分批算法
     */
    private static int selectK02(int[] arr, int k) {
        if (k < 1 || k > arr.length) {
            return -1;
        }
        int[] kArr = Arrays.copyOf(arr, k);
        bubbleSort(kArr);
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > kArr[k - 1]) {
                for (int j = kArr.length - 2; j > 0; j--) {
                    if (arr[i] < kArr[j] && arr[i] != kArr[j]) {
                        insertNum(kArr, arr[i], j + 1);
                    }
                }
            }
        }
        System.out.println("sorted: " + Arrays.toString(kArr));
        return kArr[k - 1];
    }
    /**
     * 降序排列，冒泡排序
     */
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    swap(i, j, arr);
                }
            }
        }
    }
    private static void insertNum(int[] kArr, int num, int j) {
        if (j > kArr.length) {
            return;
        }
        for (int i = kArr.length - 1; i > j; i--) {
            kArr[i] = kArr[i - 1];
        }
        kArr[j] = num;
    }


    private static void swap(int i, int j, int[] num) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    private static int[] createArray(int seed) {
        if (seed < 1000) {
            seed = 1000;
        }
        Random random = new Random(seed);
        int length = seed;
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(seed);
        }
        System.out.println("pre-sort: " + Arrays.toString(arr));
        return arr;
    }



    // 验证
    static int arrayLength = 40000;
    static int k = arrayLength / 2;

    public static void main(String[] args) {
        int[] arr = createArray(arrayLength);

        long start = System.currentTimeMillis();

        int result = selectK01(arr, k);

        long end = System.currentTimeMillis();

        long diffTime = end - start;
        System.out.println(result);
        System.out.println("============" + diffTime + " ms==================");

        long start1 = System.currentTimeMillis();

        int result1 = selectK02(arr, k);

        long end1 = System.currentTimeMillis();

        long diffTime1 = end1 - start1;
        System.out.println(result1);
        System.out.println("============" + diffTime1 + " ms==================");
    }
}
