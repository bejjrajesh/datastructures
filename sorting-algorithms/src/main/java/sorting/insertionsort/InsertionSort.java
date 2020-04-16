package sorting.insertionsort;

public class InsertionSort {

    private int[] array;

    public InsertionSort(int[] array){
        this.array = array;
    }

    public void sort(){

        for(int i = 0; i<array.length; i++){

            for(int j=0; j<=i; j++){
                //Do the swap
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void print(){
        for(int i = 0; i<array.length ; i++){
            System.out.print(array[i]+"\t");
        }
    }
}
