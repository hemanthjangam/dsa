package Arrays;

// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

// Example 1:
// Input: nums = [3,2,3]
// Output: [3]

// Example 2:
// Input: nums = [1]
// Output: [1]

// Example 3:
// Input: nums = [1,2]
// Output: [1,2]

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_II {
    static List<Integer> majority(int[] nums) {
        List<Integer> elements = new ArrayList<>();
        Integer candidate1 = null, candidate2 = null;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if ((candidate1 != null) && (num == candidate1)) {
                count1++;
            } else if ((candidate2 != null) && (num == candidate2)) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--; count2--;
            }
        }

        count1 = 0; count2 = 0;

        for (int num : nums) {
            if ((candidate1 != null) &&  num == candidate1) count1++;
            if ((candidate2 != null) && num == candidate2) count2++;
        }

        int n = nums.length;
        if (count1 > n / 3) elements.add(candidate1);
        if (count2 > n / 3) elements.add(candidate2);

        return elements;
    }

    static void main(String[] args) {
        int[] nums = {3, 3, 3, 4, 4, 4, 5, 5, 6};
        System.out.println(majority(nums));
    }
}
