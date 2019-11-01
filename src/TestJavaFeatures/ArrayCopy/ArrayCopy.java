package TestJavaFeatures.ArrayCopy;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] sub = new int[array.length / 2];


        System.arraycopy(array, 0, sub, 0, array.length / 2);

        for (int value : sub) {
            System.out.println("sub = " + value);
        }
    }
}
