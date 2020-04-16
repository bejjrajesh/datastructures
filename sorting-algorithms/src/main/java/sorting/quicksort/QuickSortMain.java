package sorting.quicksort;

public class QuickSortMain {

    public static void main(String[] args){
        int[] numbersArray = {12,34,2,33,90,123,10,5,19};
        QuickSort quickSort = new QuickSort(numbersArray);
        quickSort.sort();
        quickSort.print();
    }
}
