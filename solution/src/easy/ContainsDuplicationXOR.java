package easy;

@SuppressWarnings("all")
public class ContainsDuplicationXOR {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans ^= nums[i];
        }

        return ans != 0;
    }
}
