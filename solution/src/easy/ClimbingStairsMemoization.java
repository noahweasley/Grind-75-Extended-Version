package easy;

public class ClimbingStairsMemoization {

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    public static int climbStairs(int n) {
        int[] table = new int[n + 1];
        return climbStairsWithMemo(n, table);
    }

    private static int climbStairsWithMemo(int n, int[] table) {
        if (n == 1 || n == 0) {
            return 1;
        }

        if (table[n] != 0) {
            return table[n];
        } else {
            int sum = climbStairsWithMemo(n - 1, table) + climbStairsWithMemo(n - 2, table);
            return table[n] = sum;
        }
    }
}
