import java.util.Random;

public class SlowSort {
    public int[] bubbleSort(int[] arr) {
        if (arr.length <= 1) return arr;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public int[] insertSort(int[] arr) {
        if (arr.length <= 1) return arr;
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > val) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = val;
        }
        return arr;
    }

    public int[] selectSort(int[] arr) {
        if (arr.length <= 1) return arr;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (arr[min] < arr[i]) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] testArr = new int[50000];
        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = r.nextInt();
        }
        new Thread(() -> {
            long start = System.currentTimeMillis();
            new SlowSort().bubbleSort(testArr.clone());
            long end = System.currentTimeMillis();
            System.out.println("bubble during time: " + (end - start));
        }).start();

        new Thread(() -> {
            long start = System.currentTimeMillis();
            new SlowSort().insertSort(testArr.clone());
            long end = System.currentTimeMillis();
            System.out.println("insert during time: " + (end - start));
        }).start();

        new Thread(() -> {
            long start = System.currentTimeMillis();
            new SlowSort().selectSort(testArr.clone());
            long end = System.currentTimeMillis();
            System.out.println("select during time: " + (end - start));
        }).start();

    }
}
