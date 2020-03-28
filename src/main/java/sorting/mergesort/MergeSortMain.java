package sorting.mergesort;

public class MergeSortMain {

    public static void main(String[] args) {
        int[] numbersArray = {12, 34, 2, 33, 90, 123, 10, 5, 1,10};
        MergeSort mergeSort = new MergeSort(numbersArray);
        mergeSort.sort();
        mergeSort.print();
    }
}
