package easy;

@SuppressWarnings("all")
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int number = 0;

        for (int num : nums) {
            number ^= num;
        }

        return number;
    }
}
