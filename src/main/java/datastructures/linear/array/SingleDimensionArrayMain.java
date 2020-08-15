package datastructures.linear.array;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Driver Program for SingleDimensionArray.
 */
public class SingleDimensionArrayMain {

    public static void main(String[] args) throws InvalidArgumentException {
        SingleDimensionArray array = new SingleDimensionArray(10);
        array.insertValueAtPosition(0, 100);
        array.insertValueAtPosition(1, 200);
        array.insertValueAtPosition(2, 300);
        array.insertValueAtPosition(3, 400);
        array.insertValueAtPosition(4, 500);
        array.insertValueAtPosition(5, 600);
        array.insertValueAtPosition(6, 700);
        array.insertValueAtPosition(7, 800);
        array.insertValueAtPosition(8, 900);
        array.insertValueAtPosition(9, 1000);
        array.insertValueAtPosition(9, 200);
        array.insertValueAtPosition(12, 200);
        array.traverseArray();
        array.searchValue(10);
        array.searchValue(900);
        array.deleteValue(9);
        array.traverseArray();
        int value = array.getValue(1);
        System.out.println("Value at the index 1 is : " + value);
    }
}

