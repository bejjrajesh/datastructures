package datastructures.linear.array;

import com.sun.javaws.exceptions.InvalidArgumentException;
import sun.plugin.dom.exception.InvalidStateException;

/**
 * An Array is a contiguous elements of same data type. All the elements of an array stored in
 * contiguous locations in memory and each elements size is determined by datatype of the array. An
 * Array is treated like an Object in Java and the reference variable for Array stores address of
 * first element in the array. The Subsequent elements addresses are computed using startingAddress
 * + (index * datatype).
 */
public class SingleDimensionArray {

    private int[] arr;

    /**
     * Creates an array of size
     * * @param size
     */
    public SingleDimensionArray(int size) {
        arr = new int[size];
    }

    /**
     * Inserts values at given position. If the position is out of index limits of Array and an error is thrown.
     *
     * @param position - index where element needs to be inserted.
     * @param value  -  value to be inserted.
     */
    public void insertValueAtPosition(int position, int value) throws InvalidArgumentException {
        if (position < 0 || position > arr.length) {
            throw new InvalidArgumentException(new String[]{"Invalid Position" + position});
        } else if (arr[position] != 0) {
            throw new InvalidArgumentException(new String[]{"Position Already Occupied" + position});
        } else {
            arr[position] = value;
        }
    }

    /**
     * This method prints elements of the Array from starting index to end index.
     * If array is not initialized throws InvalidStateException.
     */
    public void traverseArray() {
        if (arr == null || arr.length == 0) {
            throw new InvalidStateException("Array not initialized ");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Index=" + i + "\t value=" + arr[i]);
            }
        }
    }

    /**
     * This method returns value at the given index. If the given index is out of range throws InvalidArgumentException
     *
     * @param index - Index of the elemen in the array.
     * @return the values stored at given index.
     */
    public int getValue(int index) throws InvalidArgumentException {
        if (arr == null || arr.length == 0) {
            throw new InvalidStateException("Array not initialized ");
        } else if (index >= arr.length) {
            throw new InvalidArgumentException(new String[]{"Index out of range" + index});
        } else {
            return arr[index];
        }
    }

    /**
     * This method search for the given value in the array and return the index if eleement is found.
     * If the element does not exists in the array returns -1;
     *
     * @param value - value to search for in the array.
     */
    public int searchValue(int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }
        return index;
    }

    /**
     * This method removes an element from the given index.
     * If the array is not initialized it throws InvalidStateException
     * If the Index greater than array size throws InvalidArgumentException.
     *
     * @param index - Element Index to be deleted.
     */
    public void deleteValue(int index) throws InvalidArgumentException {
        if (arr == null || arr.length == 0) {
            throw new InvalidStateException("Array not initialized ");
        } else if (index >= arr.length) {
            throw new InvalidArgumentException(new String[]{"Index out of range" + index});
        } else {
            arr[index] = 0;
        }
    }
}
