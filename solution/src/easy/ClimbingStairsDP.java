package easy;

public class ClimbingStairsDP {
    public static void main(String[] args) {
        System.out.println(climbStairs(12));
    }

    public static int climbStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int[] table = new int[n + 1];

        table[0] = table[1] = 1;

        for (int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }

        return table[n];
    }
}
