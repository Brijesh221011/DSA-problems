

public class Solution {
    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) ? 0 : (int) res;
    }

    public static void main(String[] args) {
        int x = 120;
        int result = reverse(x);
        System.out.println(result); 
    }
}
