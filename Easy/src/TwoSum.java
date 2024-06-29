public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int l = 0, r = 1;
        int sum = 0;

        while (l < r) {
            sum = nums[l] + nums[r];

            if (sum > target) {
                sum -= nums[l++];
            } else if (sum < target) {
                r++;
            } else {
                break;
            }

        }

        return new int[]{l, r};
    }
}

