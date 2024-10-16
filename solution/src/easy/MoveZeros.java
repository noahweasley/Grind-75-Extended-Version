package easy;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 1, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        int nonZeroIndex = 0;

        while (nonZeroIndex < nums.length) {
            if (nums[nonZeroIndex] != 0) {
                if (zeroIndex != nonZeroIndex) {
                    int temp = nums[zeroIndex];
                    nums[zeroIndex] = nums[nonZeroIndex];
                    nums[nonZeroIndex] = temp;
                }
                zeroIndex++;
            }
            nonZeroIndex++;
        }
    }
}
