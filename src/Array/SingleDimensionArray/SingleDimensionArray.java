package Array.SingleDimensionArray;

public class SingleDimensionArray {
    int[] arr = null;

    //constructor
    public SingleDimensionArray(int sizeOffArray) {
        this.arr = new int[sizeOffArray];
        for (int i = 0; i < sizeOffArray; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //print
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i + 1 + ")" + arr[i] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array Does not Exist");
        }
    }

    //insertion
    public void insertValue(int value, int position) {
        try {
            if (arr[position - 1] == Integer.MIN_VALUE) {
                arr[position - 1] = value;
            } else {
                System.out.println("Position Already filled!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Position is Invalid");
        }
    }

    //print at specific position
    public void printValueAt(int position) {
        try {
            System.out.println("value = " + arr[position - 1] + " at " + "position = " + position);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
        }
    }

    //print position of a value
    public void printPositionOF(int value) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    System.out.println(i +1 +" Is the position of value = " + value);
                    return;
                }

            }
            System.out.println("Value Not Found in the Array!");

        }catch (Exception e){
            System.out.println("Error at printPositionOF function");
        }
    }
}
