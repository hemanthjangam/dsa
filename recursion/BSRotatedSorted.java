package recursion;

public class BSRotatedSorted {
    static void main(String[] args) {
        int[] nums = { 5, 6, 1, 2, 3};
        System.out.println(search(nums, 0, nums.length - 1, 1));
    }
    static int search(int[] nums, int low, int high, int target) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (nums[mid] == target) return mid;
        if (nums[low] <= nums[mid]) {
            if (target >= nums[low] && target <= nums[mid]) return search(nums, low, mid - 1, target);
            else return search(nums, mid + 1, high, target);
        }
        if (target >= nums[mid] && target <= nums[high]) return search(nums, mid + 1, high, target);
        return search(nums, low, mid - 1, target);
    }
}
