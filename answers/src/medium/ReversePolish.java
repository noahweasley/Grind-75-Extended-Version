package medium;

import java.util.Stack;

class ReversePolish {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
    }
    public static int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();

        for (String token : tokens) {
            if (!isOperator(token)) {
                s.push(token);
            } else {
                String second = s.pop();
                String first = s.pop();

                String result = doMath(first, second, token);
                s.push(result);
            }
        }

        return Integer.parseInt(s.pop());
    }

    private static boolean isOperator(String token) {
        return token.equals("*") || token.equals("+") || token.equals("-") || token.equals("/");
    }

    private static String doMath(String first, String second, String operator) {
        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);

        int result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };

        return String.valueOf(result);
    }
}