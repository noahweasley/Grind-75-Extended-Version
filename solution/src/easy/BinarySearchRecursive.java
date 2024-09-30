package easy;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 5));
    }

    public static int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    private static int binarySearch(int start, int end, int[] array, int target) {
        if (end >= start) {
            int mid = start + (end - start) / 2;

            if (array[mid] < target) {
                return binarySearch(++mid, end, array, target);
            } else if (array[mid] > target) {
                return binarySearch(start, --mid, array, target);
            } else if (array[mid] == target) {
                return mid;
            }
        }

        return -1;
    }
}
