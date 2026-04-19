package Arrays;

// Given an array of integers nums and an integer k,
// return the total number of subarrays whose sum equals to k.
// A subarray is a contiguous non-empty sequence of elements within an array.

// Example 1:
// Input: nums = [1,1,1], k = 2
// Output: 2

// Example 2:
// Input: nums = [1,2,3], k = 3
// Output: 2

import java.util.HashMap;

public class SubarraySumEqualsK {
    static int countSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> prefix = new HashMap<>();
        prefix.put(0, 1);
        int count = 0, curr = 0;

        for (int num : nums) {
            curr += num;
            if (prefix.containsKey(curr - k)) {
                count += prefix.get(curr - k);
            }
            prefix.put(curr, prefix.getOrDefault(curr, 0) + 1);
        }

        return count;
    }

    static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        int count = countSubarrays(nums, k);
        System.out.println(count);
    }
}
