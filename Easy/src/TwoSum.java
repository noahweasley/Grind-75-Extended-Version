import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        final var nums1 = new int[]{2, 7, 11, 15};
        int target1 = 9;

        int[] answer = twoSum(nums1, target1);
        System.out.println("Indices of sum: " + target1 + " in " + Arrays.toString(nums1) + " is" + Arrays.toString(answer));

        final var nums2 = new int[]{3, 2, 4};
        int target2 = 6;

        int[] answer2 = twoSum(nums2, target2);
        System.out.println("Indices of sum: " + target2 + " in " + Arrays.toString(nums2) + " is" + Arrays.toString(answer2));


        final var nums3 = new int[]{3, 3};
        int target3 = 6;

        int[] answer3 = twoSum(nums3, target3);
        System.out.println("Indices of sum: " + target2 + " in " + Arrays.toString(nums2) + " is" + Arrays.toString(answer2));
    }

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

