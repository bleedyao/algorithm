package round01;

public class _70_climbing_stairs {
    public static void main(String[] args) {
        int count = 10;
        System.out.println(climb_stairs(count));
        System.out.println(climbStairs(count));
    }

    private static int climb_stairs(int num) {
        if (num == 1) return num;
        if (num == 2) return num;
        return climb_stairs(num - 1) + climb_stairs(num - 2);
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
