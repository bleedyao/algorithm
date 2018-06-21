/**
 * 编写一个递归方法，它返回数 N 的二进制表示中 1 的个数。
 * 利用这样的事实：如果 N 是奇数，那么其 1 的个数等于 N/2 的二进制表示中 1 的个数加 1
 */
public class Demo02 {
    public static int method01(int n) {
        if (n < 2)
            return n;
        return n % 2 + method01(n / 2);
    }

    public static void main(String[] args) {
        System.out.println(method01(7));
    }
}
