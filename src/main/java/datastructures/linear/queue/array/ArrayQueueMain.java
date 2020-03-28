package datastructures.linear.queue.array;

public class ArrayQueueMain {

    public static void main(String args[]){

        ArrayQueue arrayQueue = new ArrayQueue(10);
        System.out.println("Is Queue Empty : " +arrayQueue.isEmpty());
        arrayQueue.enQueue(100);
        arrayQueue.printQueue();
        arrayQueue.enQueue(240);
        arrayQueue.printQueue();
        arrayQueue.enQueue(300);
        arrayQueue.printQueue();
        arrayQueue.enQueue(500);
        arrayQueue.printQueue();
        arrayQueue.deQueue();
        arrayQueue.printQueue();
        System.out.println("Is Queue Empty : " +arrayQueue.isEmpty());
        System.out.println("Is Queue Full : " +arrayQueue.isQueueFull());
    }
}
