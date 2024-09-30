package easy;

public class BinarySearchIterative {

    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 3, 4, 5, 7}, 5));
    }

    public static int search(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (numbers[mid] == target) {
                return mid;
            } else if (target > numbers[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

}
