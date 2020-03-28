package sorting.bucketsort;

public class BucketSortMain {

    private static final int[] SAMPLE_DATA = {12, 34, 2, 33, 90, 123, 10, 5, 1};

    public static void main(String args[]) {
        BucketSort bucketSort = new BucketSort(SAMPLE_DATA);
        bucketSort.sort();
        bucketSort.print();
    }
}
