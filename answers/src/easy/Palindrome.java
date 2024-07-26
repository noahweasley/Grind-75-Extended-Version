public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Damosel, a poem? A carol? Or a cameo pale? (So mad!)"));
    }

    public static boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("ss = " + ss);
        int l = 0, r = ss.length() - 1;

        while (l < r) {
            char left = ss.charAt(l++);
            char right = ss.charAt(r--);

            if (!String.valueOf(left).equalsIgnoreCase(String.valueOf(right))) {
                return false;
            }

        }

        return true;
    }


}
