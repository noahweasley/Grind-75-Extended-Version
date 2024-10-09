package easy;

public class BackspaceStringCompare2 {

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ac#c";
        System.out.println(backspaceCompare(s, t));
    }

    private static boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }

    private static String helper(String input) {
        StringBuilder sb = new StringBuilder();
        int hashCount = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '#') {
                hashCount++;
                continue;
            } else if (hashCount > 0) {
                hashCount--;
                continue;
            }
            sb.append(input.charAt(i));
        }
        sb.reverse();
        return sb.toString();
    }
}