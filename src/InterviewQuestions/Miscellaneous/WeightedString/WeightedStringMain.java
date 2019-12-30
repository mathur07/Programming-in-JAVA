package InterviewQuestions.Miscellaneous.WeightedString;

public class WeightedStringMain {
    public static void main(String[] args) {
        int weight = 25;
        int[] array = new int[26];
        array[0] = 1;

        for (int i = 1; i < 26; i++) {
            array[i] = array[i - 1] * (i + 1) + array[i - 1];
        }


        StringBuilder str = new StringBuilder();
        while (weight != 0) {
            for (int i = 0; i < array.length; i++) {
                if (weight < array[i]) {
                    weight -= array[i - 1];

                    break;
                }
            }
        }
        System.out.println("str = " + str);
    }
}
