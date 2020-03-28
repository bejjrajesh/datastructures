package sorting.selectionsort;

import sorting.bubblesort.BubbleSort;

public class SelectionSortMain {
    public static void main(String[] args) {
        int[] numbersArray = {12, 34, 2, 33, 90, 123, 10, 5, 1};
        SelectionSort selectionSort = new SelectionSort(numbersArray);
        selectionSort.sort();
        selectionSort.print();
    }
}
