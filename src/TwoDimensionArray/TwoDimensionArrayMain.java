package TwoDimensionArray;

public class TwoDimensionArrayMain {
    public static void main(String[] args) {
        TwoDimensionArray tda = new TwoDimensionArray(3,5);
        tda.traverseArray();

        tda.insertValue(2020,2,2);
        tda.traverseArray();
    }
}
