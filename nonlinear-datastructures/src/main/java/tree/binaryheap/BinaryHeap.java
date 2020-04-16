package tree.binaryheap;

public class BinaryHeap {

    private int[] arr;
    private int size = 0;

    public BinaryHeap(int size) {
        this.arr = new int[size + 1];
        initializeArray();
    }

    private void initializeArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
    }

    public BinaryHeap(int[] arr) {
        this.arr = arr;
    }

    public void insert(int value) {
        size++;
        arr[size] = value;
        heapifyBottomToTop(size);
    }

    private void heapifyBottomToTop(int childIndex) {
        if(childIndex < 1){
            return;
        }
        int parentIndex = childIndex / 2;
        if (arr[childIndex] < arr[parentIndex]) {
            int temp = arr[size];
            arr[parentIndex] = temp;
            arr[size] = temp;
        }
        heapifyBottomToTop(parentIndex);
    }

    private void heapifyTopToBottom(int rootIndex) {
       int leftIndex = rootIndex * 2;
       int rightIndex = rootIndex * 2 + 1;
       if(size < leftIndex){
           return;
       }else if( size == leftIndex){
           int temp = arr[rootIndex];
           arr[rootIndex] = arr[leftIndex];
           arr[leftIndex] = temp;
           return;
       }else{
           int minIndex = leftIndex;
           if( arr[leftIndex] > arr[rightIndex]){
               minIndex = rightIndex;
           }
           int temp = arr[rootIndex];
           arr[rootIndex] = arr[minIndex];
           arr[minIndex] = temp;
           heapifyTopToBottom(minIndex);
       }
    }

    public int pop() {
        int temp = arr[1];
        arr[1] = arr[size];
        arr[size] = -1;
        size--;
        heapifyTopToBottom(1);
        return temp;
    }

    public void print() {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
