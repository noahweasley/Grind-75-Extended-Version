package medium;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubArray(arr));
    }

    private static int maxSubArray(int[] nums) {
        int windowSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            windowSum = Math.max(windowSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}

