package easy;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }

    public static int hammingWeight(int n) {
        int weight = 0;

        while (n > 0) {
            weight += n & 1;
            n = n / 2;
        }

        return weight;

    }
}
