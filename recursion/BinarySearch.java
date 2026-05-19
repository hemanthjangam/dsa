package recursion;

public class BinarySearch {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(recursiveSearch(nums, 0, nums.length - 1, 0));
    }
    static int recursiveSearch(int[] nums, int low, int high, int target) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (nums[mid] == target) return mid;
        if (nums[mid] <= target) low = mid + 1;
        else high = mid - 1;
        return recursiveSearch(nums, low, high, target);
    }
}
