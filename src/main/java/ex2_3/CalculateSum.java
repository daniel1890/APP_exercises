package ex2_3;

public class CalculateSum {
    public CalculateSum() {
    }

    public int CalculateNonRecursively(int n) {
        int ans = 0;
        for (int i = n; i >= 1; i--) {
            ans += i;
        }

        return ans;
    }

    public int calculateRecursively(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + calculateRecursively(n - 1);
    }
}
