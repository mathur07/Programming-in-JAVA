package LeetCode.Easy.ValidParentheses;

import java.util.Stack;

public class ValidParenthesesMain {
    public static void main(String[] args) {
        String input_string = "{{()}{";
        boolean result = valid_parentheses(input_string);
        System.out.println("result = " + result);
    }

    private static boolean valid_parentheses(String input_string) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input_string.length(); i++) {
            char target = input_string.charAt(i);
            if ('('==target || '{'==target || '['==target) {
                stack.push(target);
            }
            if (!stack.empty()) {
                if (')'==target || '}'==target || ']'==target) {
                    Character temp = stack.pop();

                    if (')'==target && !(temp == '(')) {
                        return false;
                    }
                    if ('}'==target && !(temp == '{')) {
                        return false;
                    }
                    if (']'==target && !(temp == '[')) {
                        return false;
                    }

                }
            } else {
                return false;
            }
        }

        return stack.empty();

    }
}
