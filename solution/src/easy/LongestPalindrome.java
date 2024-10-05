package easy;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    private static int longestPalindrome(String s) {
        Set<Character> charSet = new HashSet<>();
        int length = 0;

        for (char c : s.toCharArray()) {
            if (charSet.contains(c)) {
                charSet.remove(c);
                length += 2;
            } else {
                charSet.add(c);
            }
        }

        if (!charSet.isEmpty()) {
            length += 1;
        }

        return length;

    }

}