package Numbers;

// You are given an integer n.
// Define its mirror distance as: abs(n - reverse(n)) where reverse(n) is the integer formed by
// reversing the digits of n.
// Return an integer denoting the mirror distance of n.
// abs(x) denotes the absolute value of x.

// Example 1:
// Input: n = 25
// Output: 27
// Explanation:
// reverse(25) = 52.
// Thus, the answer is abs(25 - 52) = 27.

// Example 2:
// Input: n = 10
// Output: 9

// Example 3:
// Input: n = 7
// Output: 0

import java.util.Scanner;

public class MirrorDistance {
    static int distance(int n) {
        int num = n;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return Math.abs(n -rev);
    }

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int n = in.nextInt();

        int res = distance(n);

        System.out.println(res);
    }
}
