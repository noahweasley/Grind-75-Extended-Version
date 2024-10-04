package easy;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 3};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int majority = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > (nums.length / 2)) {
                return entry.getKey();
            }
        }

        return majority;
    }
}
