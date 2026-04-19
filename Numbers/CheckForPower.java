package Numbers;

// Given two positive integers x and y, determine if y is a power of x. If y is a power of x,
// return true. Otherwise, return false.

// Examples:
// Input: x = 2, y = 8
// Output: true
// Explanation: 23 is equal to 8.

// Input: x = 1, y = 8
// Output: false
// Explanation: Any power of 1 is not equal to 8.

// Input: x = 46, y = 205962976
// Output: true
// Explanation: 465 is equal to 205962976.

// Input: x = 50, y = 312500000
// Output: true
// Explanation: 505 is equal to 312500000.

public class CheckForPower {
    static boolean check(int x, int y) {
        if (x == 1) return y == 1;

        // Compute k = log_x(y)
        double k = Math.log(y) / Math.log(x);

        // Round k to nearest integer
        int kInt = (int) Math.round(k);

        // Verify to avoid precision errors
        return Math.pow(x, kInt) == y;
    }

    static void main(String[] args) {
        int x = 2, y = 8;
        boolean res = check(x, y);
        System.out.println(res);
    }
}
