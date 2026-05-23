package recursion;

import java.util.ArrayList;

public class Search {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 1, 2};
        System.out.println(search(nums, 1, 0));
    }

    static ArrayList<Integer> search(int[] nums, int target, int index) {
        ArrayList<Integer> currList = new ArrayList<>();
        if (index == nums.length) return currList;
        if (nums[index] == target) currList.add(index);
        ArrayList<Integer> list = search(nums, target, ++index);
        currList.addAll(list);
        return currList;
    }
}
