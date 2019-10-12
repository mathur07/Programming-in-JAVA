package Array.TwoDimensionArray;

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
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    //insertion
    public void insertValue(int value, int row, int column) {
        try {
            if (arr[row - 1][column - 1] == Integer.MIN_VALUE) {
                arr[row - 1][column - 1] = value;
            } else {
                System.out.println("Position Already filled!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Position is Invalid");
        }
    }

    //print at specific position
    public void printValueAt(int row, int column) {
        try {
            System.out.println("value = " + arr[row - 1][column - 1] + " at " + "row = " + row + " column = " + column);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
        }
    }

    //print position of a value
    public void printPositionOF(int value) {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] == value) {
                        System.out.print("row = ");
                        System.out.print(i + 1);
                        System.out.print(" column = ");
                        System.out.print(j + 1);
                        return;
                    }
                }
            }
            System.out.println("Value Not Found in the Array!");

        } catch (Exception e) {
            System.out.println("Error at printPositionOF function");
        }
    }
}
