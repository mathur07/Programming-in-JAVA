package InterviewQuestions.GoMMT.QOne;

public class QOneMain {
    public static void main(String[] args) {

        int[] array = new int[]{10, 15, 3, 7};
        int k = 17;
        boolean result;

//        Arrays.sort(array);

        result = SumExists(array, k);

        System.out.println(result);


    }

    private static boolean SumExists(int[] array, int k) {
        for (int i = 0, j = array.length - 1; i < j; ) {
            int sum = array[i] + array[j];
            if (sum < k) {
                i++;
            } else if (sum > k) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }


}
