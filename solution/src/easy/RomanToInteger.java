package easy;

public class RomanToInteger {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        String roman = "LVIII";
        System.out.println(romanToInt(roman));
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = romanValue(s.charAt(i));

            if (i != s.length() - 1 && value < romanValue(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }

        return result;
    }

    static int romanValue(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default ->  throw new IllegalArgumentException("Invalid Roman numeral: " + ch);
        };
    }

}
