package ex2_2;

public class CalculateFactorial {

    public CalculateFactorial() {

    }

    public int calculateNonRecursively(int n) {
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= i;
        }

        return ans;
    }

    public int calculateRecursively(int n) {
    if (n <= 1) {
            return 1;
        }

        return n * calculateRecursively(n - 1);
    }
}
