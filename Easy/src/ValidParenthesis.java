import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        Stack<Character> pStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                if (i + 1 == s.length()) return false;
                pStack.push(current);
            } else {
                if (pStack.isEmpty()) {
                    return false;
                }

                char previous = pStack.pop();
                if (!isMatchingPair(previous, current)) {
                    return false;
                }
            }

        }

        return true;
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }

}
