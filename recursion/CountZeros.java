package recursion;

public class CountZeros {
    static void main(String[] args) {
        int n = 1;
        System.out.println(zeros(n, 0));
    }

    static int zeros(int n, int count) {
        if (n <= 0) return count;
        if (n % 10 == 0) count++;
        return zeros(n / 10, count);
    }
}
