package recursion;

public class Fibonacci {
//    First approach using prev and currPrev

//    static void main(String[] args) {
//        int n = 7;
//        int prev = 0, curr = 1;
//        int fibOfN = fib(n, prev, curr);
//        System.out.println(fibOfN);
//    }
//
//    static int fib(int n, int prev, int currPrev) {
//        if (n == 1) return currPrev;
//        int curr = prev + currPrev;
//        return fib(n - 1, currPrev, curr);
//    }

//    Second approach even simpler with two recursion methods

    static void main(String[] args) {
        int n = 7;
        System.out.println(fibOfN(n));
    }

    static int fibOfN(int n) {
        if (n == 0 || n == 1) return n;
        return fibOfN(n - 1) + fibOfN(n - 2);
    }
}
