//X^n
public class power_r {
    public static int calcpower(int x, int n) {
        if (n == 0) { // base case1
            return 1;
        }
        if (x == 0) { // base case2
            return 0;
        }
        int xpownm1 = calcpower(x, n - 1); // main work
        int xpown = x * xpownm1;
        return xpown;
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = calcpower(x, n);
        System.out.println(ans);
    }
}