package recursion;

public class Numbers {
    static void main() {
        int n = 5;
        printNumbers(5);
    }

    static void printNumbers(int n) {
        if (n < 1) return;
        printNumbers(n - 1);
        System.out.println(n);
    }
}
