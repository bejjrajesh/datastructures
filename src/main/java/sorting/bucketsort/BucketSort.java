package sorting.bucketsort;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    private int[] array;

    public BucketSort(int[] array) {
        this.array = array;
    }

    public void sort() {

        //Find the Maximum Element in the given array.
        int maxValue = findMaxValue();

        //Calculate Number of Buckets Need. Formula Used : square root of array length rounded to its ceil value.
        int numberOfBuckets = Double.valueOf(Math.ceil(Math.sqrt(array.length))).intValue();

        //Temporary List to hold concatenated sorted values from all the buckets.
        ArrayList<Integer> temp = new ArrayList<>();

        //Create Buckets and Initialize as empty array lists.
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for(int k=0;k<numberOfBuckets;k++){
            buckets[k] =  new ArrayList<>();
        }

        //Iterate through all the values in the array and put it in the right bucket.
        for (int i = 0; i < array.length; i++) {
            double bucketLocationValue = Math.ceil(array[i] * (numberOfBuckets-1) / maxValue);
            int bucketLocation = Double.valueOf(bucketLocationValue).intValue();
            buckets[bucketLocation].add(array[i]);
        }

        //Now sort the individual buckets and merge it with temp List.
        for (ArrayList arrayList : buckets) {
            Collections.sort(arrayList);
            temp.addAll(arrayList);
        }

        //Finally copy temp List into array. Since temp is List and array an array of int type, we have to iterate and copy.
        //This needs to done for Java but in python or other languages we can do this one line code.
        for(int i=0;i<array.length;i++){
            array[i] = temp.get(i);
        }
    }

    private int findMaxValue() {

        // Default Initial Max Value. Integer.MIN_VALUE.
        int max = Integer.MIN_VALUE;

        //Iterate trough the list and update max value.
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public void print() {

        //Iterate through the Array and Print the values.
        System.out.println(" ---- ---- ---- ---- ---- ---- ---- ---- ----");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" | " + array[i]);
        }
        System.out.print(" |");

        System.out.println("\n ---- ---- ---- ---- ---- ---- ---- ---- ----");
    }
}
