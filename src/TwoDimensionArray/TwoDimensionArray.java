package TwoDimensionArray;

public class TwoDimensionArray {
    int[][] arr = null;

    //constructor
    public TwoDimensionArray(int row, int colunm) {
        try {
            this.arr = new int[row][colunm];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colunm; j++) {
                    arr[i][j] = Integer.MIN_VALUE;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem in Constructor!");
        }
    }

    //traverseArray
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.println(arr[0].length);
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
