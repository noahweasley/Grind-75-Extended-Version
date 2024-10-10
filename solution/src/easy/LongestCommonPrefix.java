package easy;

import java.util.Arrays;

@SuppressWarnings("all")
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strings = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strings));
    }

    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        int len = strs.length - 1;
        String first = strs[0];
        String last = strs[len];
        int n = Math.min(first.length(), last.length());

        StringBuilder longestPrefix = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (first.charAt(i) == last.charAt(i)) {
                System.out.println(first.charAt(i));
                longestPrefix.append(first.charAt(i));
            } else {
                break;
            }
        }

        return longestPrefix.toString();
    }
}
