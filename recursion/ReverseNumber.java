package recursion;

public class ReverseNumber {
    static void main(String[] args) {
        int n = 12345;
        int rev =  0;
        System.out.println(reverse(n, rev));
    }
//    didnt solve yet
    static int reverse(int n, int rev) {
        if (n % 10  == n) return (rev * 10) + (n % 10);
        rev *= 10 + n % 10;
        return (reverse(n / 10, rev));
    }
}
