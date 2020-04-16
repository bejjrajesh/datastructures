package sorting.quicksort;

public class QuickSort {

    private int[] array;

    public QuickSort(int size){
        this.array = new int[size];
    }

    public QuickSort(int[] array){
        this.array = array;
    }

    public void sort(){
        quickSort(array,0,array.length-1);
    }

    private void quickSort(int[] array, int low, int high) {
        if(low < high){
            int pivot = partition(array, low, high);
            quickSort(array, low,pivot-1);
            quickSort(array,pivot+1,high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(array[j] <= pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }

    public void print(){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
}
