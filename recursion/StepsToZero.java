package recursion;

public class StepsToZero {
    static void main(String[] args) {
        int n = 12324;
        System.out.println(steps(n, 0));
    }

    static  int steps(int n, int step) {
        if (n <= 0) return step;
        if (n % 2 == 0) n = n / 2;
        else n = n - 1;
        return steps(n, ++step);
    }
}
