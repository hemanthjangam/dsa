package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(generate(nums, 0, new ArrayList<>(), 0));
    }

    static List<List<Integer>> generate(int[] nums, int index, List<List<Integer>> output, int outIndex) {
        if (index >= nums.length) return output;
        if (output.isEmpty()) output.add(new ArrayList<>());
        List<List<Integer>> newSubsets = new ArrayList<>();
        for (List<Integer> subset : output) {
            List<Integer> subsets = new ArrayList<>(subset);
            subsets.add(nums[index]);
            newSubsets.add(subsets);
        }
        output.addAll(newSubsets);
        return generate(nums, index + 1, output, outIndex + 1);
    }
}
