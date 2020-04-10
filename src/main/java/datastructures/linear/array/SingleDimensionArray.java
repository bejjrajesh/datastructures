package datastructures.linear.array;

public class SingleDimensionArray {

    private int[] arr;

    public SingleDimensionArray(int size) {
        arr = new int[size];
    }

    public void insertValueAtPosition(int position, int value) {
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid Index specified");
        } else if (arr[position] != 0) {
            System.out.println("Position Already Occupied");
        } else {
            arr[position] = value;
        }
    }

    public void traverseArray() {
        if (arr == null || arr.length == 0) {
            System.out.println("Empty Array!");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Index=" + i + "\t value=" + arr[i]);
            }
        }
    }

    public int getValue(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("Empty Array!");
            return -1;
        } else if (index >= arr.length) {
            System.out.println("Index out of range!!");
            return -1;
        } else {
            return arr[index];
        }
    }

    public void searchValue(int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Value not found in the array");
        } else {
            System.out.println("Value found at index : " + index);
        }
    }

    public void deleteValue(int index) {
        if ((arr == null || arr.length == 0) || index >= arr.length) {
            System.out.println("Array not initialize or invalid index");
        } else {
            arr[index] = 0;
        }
    }
}
