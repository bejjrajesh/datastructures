package sorting.mergesort;

public class MergeSort {

    private int[] array;

    //Initialize the Array.
    public MergeSort(int[] array) {
        this.array = array;
    }

    //Driver method for triggering actual sorting functionality recursively.
    public void sort() {
        mergeSort(array, 0, array.length-1);
    }

    // Divide the array in two halves and merge as long as low < high
    private void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    // This method performs merging for each halves from mergesort method.
    private void merge(int[] array, int low, int mid, int high) {

        // Calculate Left Array size which is middle cell index - first cell index + 2;
        int leftArraySize = mid - low + 2 ;

        // Calculate Right Array size which is last cell index - middle cell index + 1
        int rightArraySize = high - mid + 1;

        //Create Temporary arrays to copy left sub array and right sub array values.
        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        //copy all left side values of middle to left array and right side values of middle to right array. 
        for (int i = 0; i <= mid-low; i++) {
            leftArray[i] = array[low + i];
        }
        for (int j = 0; j < high-mid; j++) {
            rightArray[j] = array[mid + 1 +  j];
        }

        leftArray[mid-low +1 ]= Integer.MAX_VALUE;
        rightArray[high-mid] = Integer.MAX_VALUE;

        int i=0,j=0;
        for (int k = low; k <= high ; k++) {
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
    }
}
