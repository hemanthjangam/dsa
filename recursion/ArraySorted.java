package recursion;

public class ArraySorted {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sorted(arr, 1));
    }

    static boolean sorted(int[] arr, int index) {
        if (index > arr.length - 1) return true;
        if (arr[index] < arr[index - 1]) return false;
        return sorted(arr, ++index);
    }
}
