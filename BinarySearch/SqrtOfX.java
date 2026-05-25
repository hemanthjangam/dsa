package BinarySearch;

public class SqrtOfX {
    static void main(String[] args) {
        int x = 8;
        System.out.println(sqrt(x));
    }

    static int sqrt(int x) {
        if (x == 0 || x == 1) return x;
        int l = 1, r = x / 2;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            long square =  (long) mid * mid;
            if (square == x) return mid;
            if (square < x) l = mid + 1;
            else r = mid - 1;
        }

        return r;
    }
}
