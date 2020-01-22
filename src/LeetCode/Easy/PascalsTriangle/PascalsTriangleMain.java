package LeetCode.Easy.PascalsTriangle;

import java.util.List;

public class PascalsTriangleMain {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> list;
        list = generate(numRows);
        System.out.println("list = " + list);
    }


}
