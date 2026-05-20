package recursion;

public class SumOfDigits {
    static void main() {
        int n = 345231431;
        System.out.println(sum(n));
    }

    static int sum(int n ) {
        if (n == 0) return 0;
        return n % 10 + sum(n / 10);
    }
}
