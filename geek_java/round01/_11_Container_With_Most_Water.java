package round01;

public class _11_Container_With_Most_Water {
    public static void main(String[] args) {
        int tmp = maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });
        System.out.println(tmp);
        tmp = maxArea(new int[] { 1, 1 });
        System.out.println(tmp);
        tmp = maxArea(new int[] { 4, 3, 2, 1, 4 });
        System.out.println(tmp);
        tmp = maxArea(new int[] { 1, 2, 1 });
        System.out.println(tmp);
    }

    public static int maxArea(int[] height) {
        if (height == null || height.length < 2)
            return 0;
        int max = 0;
        // Solution 1
        // for (int i = 0; i < height.length - 1; i++) {
        // for (int j = i + 1; j < height.length; j++) {
        // int tmp = (j - i) * Math.min(height[i], height[j]);
        // max = Math.max(tmp, max);
        // }
        // }
        // return max;

        // Solution 2
        for (int i = 0, j = height.length - 1; i < j;) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            int tmp = (j - i +1 ) * minHeight;
            max = Math.max(tmp, max);
        }
        return max;
    }
}
