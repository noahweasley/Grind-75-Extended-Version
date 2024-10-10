package easy;

import java.util.Arrays;

@SuppressWarnings("all")
public class CountBitsBitwise {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(9)));
    }

    private static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }
}
