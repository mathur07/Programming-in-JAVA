package LeetCode.Easy.LongestCommonPrefix;

public class LongestCommonPrefixMain {
    public static void main(String[] args) {
        String[] input = new String[]{"flower", "flow", "flight"};
        String result;
        result = longestCommonPrefix(input);
        System.out.println("result = " + result);
    }

    private static String longestCommonPrefix(String[] input) {
        int n = input[0].length();
        char temp =  input[0].charAt(0);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n-1; i++) {
            for (String s : input) {
                if (temp != s.charAt(i)) {
                    return result.toString();
                }
                result.append(temp);
                temp = s.charAt(i);
            }
        }
        return result.toString();

    }
}
