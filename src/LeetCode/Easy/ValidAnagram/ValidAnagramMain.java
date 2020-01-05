package LeetCode.Easy.ValidAnagram;

public class ValidAnagramMain {
    public static void main(String[] args) {
        String a = "qwerty";
        String b = "wrqyte";
        boolean result;
        result = isAnagram(a, b);
        System.out.println("result = " + result);
    }

    private static boolean isAnagram(String a, String b) {

        int index;
        int[] array = new int[26];

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            index = a.charAt(i);
            index = index - 97;
            array[index]++;

            index = b.charAt(i);
            index = index - 97;
            array[index]--;
        }

        for (int value : array) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}
