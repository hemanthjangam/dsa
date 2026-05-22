package recursion;

public class ReverseNumber {
    static void main(String[] args) {
        int n = 12345;
        int rev = reverse(n, 0);
        System.out.println(rev);
    }

//    Solved in second attempt
    static int reverse(int n, int rev) {
        if (n <= 0) return rev;
        return reverse(n / 10, rev * 10 + (n % 10));
    }
}
