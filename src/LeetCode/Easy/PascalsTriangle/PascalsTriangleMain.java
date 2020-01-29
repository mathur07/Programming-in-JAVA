package LeetCode.Easy.PascalsTriangle;

import java.util.LinkedList;
import java.util.List;

public class PascalsTriangleMain {
    public static void main(String[] args) {
        int numRows = 5;
        List<List> list;
        list = generate(numRows);
        System.out.println("list = " + list);
    }

    private static List<List> generate(int numRows) {
        {
            List<List> lists = new LinkedList<>();
            int[][] triangle = new int[numRows][numRows];
            for (int i = 0; i < triangle.length; i++) {
                for (int j = 0; j < triangle[i].length; j++) {
                    if (i == j)
                        triangle[i][j] = 1;

                    if (j == 0)
                        triangle[i][j] = 1;

                    if (i != j && triangle[i][j] != 1)
                        triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];

                    if (i == j)
                        break;

                }
            }
            for (int i = 0; i < triangle.length; i++) {
                List<Integer> list = new LinkedList<>();
                for (int j = 0; j < triangle[i].length; j++) {
                    list.add(triangle[i][j]);
                    if (i == j) {
                        break;
                    }
                }
                lists.add(list);
            }
            return lists;
        }

    }
}


