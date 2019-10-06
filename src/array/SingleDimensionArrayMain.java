package array;
public class SingleDimensionArrayMain {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.traverseArray();

        sda.insertValue(50,5);
        sda.traverseArray();

        sda.insertValue(100,10);
        sda.traverseArray();

        sda.printValueAt(5);
        sda.traverseArray();

        sda.printPositionOF(50);
    }

}
