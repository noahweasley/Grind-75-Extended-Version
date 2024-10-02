package easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        final String ransomNote = "aa";
        final String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for (char cc : ransomNote.toCharArray()) {
            charMap.put(cc, charMap.getOrDefault(cc, 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() < 0) {
                return false;
            }
        }

        return true;
    }
}
