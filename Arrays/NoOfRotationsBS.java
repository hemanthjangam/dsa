package Arrays;

public class NoOfRotationsBS {
    static void main(String[] args) {
        int[] nums = {3, 4, 5};
        System.out.println(rotations(nums));
    }

    static int rotations(int[] nums) {
        int low = 0, high = nums.length - 1;
        int min = Integer.MAX_VALUE;
        int rotated = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[low] < nums[high]) {
                if (nums[low] < min) {
                    min = nums[low];
                    rotated = low;
                }
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] < min) {
                    min = nums[low];
                    rotated =  low;
                } low = mid + 1;
            } else {
                if (nums[mid] < min) {
                    min = nums[mid];
                    rotated = mid;
                } high = mid - 1;
            }
        }

        return rotated;
    }
}
