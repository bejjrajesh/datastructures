package sorting.insertionsort;

public class InsertionSortMain {

    public static void main(String args[]){
        int[] numbersArray = {12,34,2,33,90,123,10,5,1};
        InsertionSort insertionSort = new InsertionSort(numbersArray);
        insertionSort.sort();
        insertionSort.print();
    }
}
