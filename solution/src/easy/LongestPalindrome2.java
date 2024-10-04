package easy;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class LongestPalindrome2 {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    private static int longestPalindrome(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        int oddCount = 0;
        int length = s.length();

        for (int i = 0; i < length; ++i) {
            char ch = s.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

            if (freqMap.get(ch) % 2 == 1) {
                ++oddCount;
            } else {
                --oddCount;
            }
        }

        if (oddCount > 1) {
            return length - oddCount + 1;
        }

        return length;
    }
}
