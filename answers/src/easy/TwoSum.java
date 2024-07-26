import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 5, 5, 67, 1}, 10)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            if (indexMap.containsKey(target - nums[j])) {
                return new int[]{indexMap.get(target - nums[j]), j};
            } else {
                indexMap.put(nums[j], j);
            }
        }

        return new int[]{};
    }
}
