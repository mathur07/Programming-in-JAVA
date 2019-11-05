package InterviewQuestions.GoMMT.QTwo;

import java.util.Arrays;

public class QTwoMain {

    public static void main(String[] args) {
        int[] array = {3, 4, -2, 1, 7};
        int[] array1 = {1, 2, 0};

        int arrSize = array.length;

        int missing = findMissingNumber(array, arrSize);

        System.out.println(missing);
    }

    private static int findMissingNumber(int[] array, int n) {
        int result = Integer.MIN_VALUE;
        Arrays.sort(array);
        int i;
        for (i = 0; i < array.length - 2; i++) {
            if (array[i + 1] - array[i] > 1) {
                result = array[i] + 1;
            }
        }
        if (i == array.length - 2 && result == Integer.MIN_VALUE) {
            return array[array.length - 1] + 1;
        } else {
            return result;
        }
    }


}
