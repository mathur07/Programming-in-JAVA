package Array.TwoDimensionArray;

public class TwoDimensionArrayMain {
    public static void main(String[] args) {
        TwoDimensionArray tda = new TwoDimensionArray(3,3);
        tda.traverseArray();

        tda.insertValue(1020,1,2);

        tda.insertValue(2010,2,1);

        tda.insertValue(3030,3,3);

        tda.insertValue(1010,1,1);
        tda.traverseArray();

        tda.printValueAt(4,3);
        tda.traverseArray();

        tda.printPositionOF(2010);

    }
}
