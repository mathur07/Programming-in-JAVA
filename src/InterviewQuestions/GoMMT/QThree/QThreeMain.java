package InterviewQuestions.GoMMT.QThree;

import java.util.regex.Pattern;

public class QThreeMain {

    public static void main(String[] args) {

        String string = " the quick  brown fox";
        System.out.println(reverse(string));

    }

    private static String reverse(String string) {
        Pattern pattern = Pattern.compile("\\s+");

        String[] tempArray = pattern.split(string);

        String output = "";

        for (int i = 0; i < tempArray.length; i++) {
            if (i == tempArray.length - 1) {
                output = tempArray[i] + output;
            } else {
                output = " " + tempArray[i] + output;
            }
        }

        return output;


    }
}



