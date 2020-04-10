package sorting.bubblesort;

public class BubbleSort {

    //Array to hold the elements
    private int[] arr;

    //Initialize the array.
    public BubbleSort(int[] arr){
        this.arr = arr;
    }

    public void sort(){

        // Every iteration causes max element to be moved to right most side.
        for(int i=0; i<arr.length; i++) {

            // Check two elements at a time and swap if there are less than.
            //Each iteration will cause min element to be moved to as left as possible.
            for(int j=0; j<arr.length-i-1; j++) {

                //Do the swap.
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void print(){
        //Print elements separated by tab.
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
