package sorting.selectionsort;

public class SelectionSort {

    private int[] arr;

    public SelectionSort(int[] arr){
        this.arr = arr;
    }

    public void sort(){
        for(int i=0 ; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] =  temp;
                }
            }
        }
    }


    public void print(){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
