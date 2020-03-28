package sorting.bubblesort;

public class BubbleSortMain {

    //Driver Program to invoke BubbleSort Algorithm.
    public static void main(String[] args) {

        int[] numbersArray = {12, 34, 2, 33, 90, 123, 10, 5, 1};
        BubbleSort bubbleSort = new BubbleSort(numbersArray);
        //Sort the Array.
        bubbleSort.sort();
        //Print Sorted Values.
        bubbleSort.print();
    }
}
