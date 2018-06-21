/**
 * 编写下列声明的方法：
 * public void permute(String str)
 * private void permute(char[] str,int low,int high)
 * 第一个方法是个驱动程序，它调用第二个方法并显示 String str 中的字符的所有排列。
 * 如果 str 是 "abc"，那么输出的字符串则是 abc，acb，bac，bca，cab 和 cba。
 * 第二个方法使用递归。
 */
public class Demo03 {
    public void permute(String str) {
        char[] temp = str.toCharArray();
        permute(temp, 0, temp.length - 1);
    }

    private void permute(char[] str, int low, int high) {
        if (low == high) {
            StringBuilder s = new StringBuilder();
            for (char ch : str) {
                s.append(ch);
            }
            System.out.println(s);
        }
        for (int i = low; i < str.length; i++) {
            swap(str, low, i);
            permute(str, low + 1, high);
            swap(str, low, i);
        }
    }
    private static void swap(char[] str, int m, int n){
        char temp = str[m];
        str[m] = str[n];
        str[n] = temp;
    }

    public static void main(String[] args) {
        new Demo03().permute("abc");
    }
}
