package Arrays;

public class BSRotatedSorted2 {
    static void main(String[] args) {
        int[] nums = {4, 5, 6, 6, 1, 1, 2, 3};
        System.out.println(search(nums, 1));
    }
    static boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return true;
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++; high--; continue;
            }

            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target <= nums[mid]) high = mid - 1;
                else low = mid + 1;
            } else {
                if (target >= nums[mid] && target <= nums[high]) low = mid + 1;
                else high = mid - 1;
            }
        }

        return false;
    }
}
