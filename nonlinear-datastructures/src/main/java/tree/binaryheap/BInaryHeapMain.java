package tree.binaryheap;

public class BInaryHeapMain {

    public static void main(String[] args){
        BinaryHeap binaryHeap = new BinaryHeap(10);
        binaryHeap.insert(10);
        binaryHeap.insert(30);
        binaryHeap.insert(13);
        binaryHeap.insert(34);
        binaryHeap.insert(45);
        System.out.println("Printing after Insert");
        binaryHeap.print();
        binaryHeap.pop();
        System.out.println("\nPrinting after Pop");
        binaryHeap.print();
    }
}
