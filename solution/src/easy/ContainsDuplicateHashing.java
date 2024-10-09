package easy;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class ContainsDuplicateHashing {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        Set<Integer> hashTable = new HashSet<>();

        for (int x : nums) {
            if (hashTable.contains(x)) {
                return true;
            }

            hashTable.add(x);
        }

        return false;
    }
}
