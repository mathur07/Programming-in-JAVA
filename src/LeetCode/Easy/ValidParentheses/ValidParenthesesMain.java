package LeetCode.Easy.ValidParentheses;

import java.util.Stack;

public class ValidParenthesesMain {
    public static void main(String[] args) {
        String input_string = "{{()}{";
        boolean result = valid_parentheses(input_string);
        System.out.println("result = " + result);
    }

    private static boolean valid_parentheses(String input_string) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < input_string.length(); i++) {
            String[] target_array = input_string.split("");
            String target = target_array[i];
            if (("(").equals(target) || ("{").equals(target) || ("[").equals(target)) {
                stack.push(target);
            }
            if (!stack.empty()) {
                if ((")").equals(target) || ("}").equals(target) || ("]").equals(target)) {
                    String temp = stack.pop();

                    if (target.equals(")") && !temp.equals("(")) {
                        return false;
                    }
                    if (target.equals("}") && !temp.equals("{")) {
                        return false;
                    }
                    if (target.equals("]") && !temp.equals("[")) {
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
