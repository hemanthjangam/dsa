package Arrays;

import java.util.HashSet;

public class LengthOfLongestPrefix {
    static void main(String[] args) {
        int[] arr1 = {123, 4312, 123};
        int[] arr2 = {1234};
        System.out.println(length(arr1, arr2));
    }

    static int length(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            while (num > 0) {
                set.add(num);
                num = num / 10;
            }
        }

        int maxLen = 0;

        for (int num : arr2) {
            while (num > 0) {
                if (set.contains(num)) {
                    maxLen = Math.max(maxLen, getLen(num));
                } num = num / 10;
            }
        }

        return maxLen;
    }

    static int getLen(int num) {
        int len = 0;
        while (num > 0) {
            len++; num = num / 10;
        }
        return len;
    }
}
