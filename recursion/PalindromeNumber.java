package recursion;

public class PalindromeNumber {
    static void main(String[] args) {
        int n = 12221;
        System.out.println(palindrome(n, n, 0));
    }

    static boolean palindrome(int org, int n, int rev) {
        if (n <= 0) return rev == org;
        rev = (rev * 10) + (n % 10);
        return palindrome(org, n / 10, rev);
    }
}
