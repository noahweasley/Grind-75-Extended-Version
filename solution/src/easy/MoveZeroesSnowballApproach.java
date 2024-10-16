package easy;

import java.util.Arrays;

public class MoveZeroesSnowballApproach {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int snowBallSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowBallSize++;
            } else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i] = 0;
                nums[i - snowBallSize] = t;
            }
        }
    }

}
