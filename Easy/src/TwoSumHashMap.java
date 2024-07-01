import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
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
