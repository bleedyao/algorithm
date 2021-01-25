package round04;

public class _70_climbing_stairs {
    public static void main(String[] args) {
        int count = 2;
        System.out.println(climbStairs(count));
    }

    private static int climbStairs(int n) {
        int a = 0, b = 0, c = 1;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }

}
