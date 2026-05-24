package Arrays;

public class FinMinimumRotatedBS {
    static void main(String[] args) {
        int[] nums = {5, 6, 7, 0, 1, 2, 3, 4};
        System.out.println(minimum(nums));
    }

    static int minimum(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[mid]) {
                min = Math.min(min, nums[low]);
                low = mid + 1;
            } else {
                min = Math.min(nums[mid], min);
                high = mid - 1;
            }
        }

        return min;
    }
}
