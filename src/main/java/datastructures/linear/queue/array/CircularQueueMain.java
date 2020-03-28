package datastructures.linear.queue.array;

public class CircularQueueMain {

    public static void main(String args[]){
        CircularQueue cQueue = new CircularQueue(5);
        System.out.println("Is Queue Empty : "+ cQueue.isQueueEmpty());
        System.out.println("Is Queue Full : "+ cQueue.isQueueFull());
        cQueue.enQueue(100);
        cQueue.printQueue();
        cQueue.enQueue(200);
        cQueue.printQueue();
        cQueue.enQueue(300);
        cQueue.printQueue();
        cQueue.enQueue(400);
        cQueue.printQueue();
        cQueue.enQueue(500);
        cQueue.printQueue();
        cQueue.enQueue(600);
        cQueue.printQueue();
        cQueue.deQueue();
        cQueue.printQueue();
        cQueue.enQueue(400);
        cQueue.printQueue();
    }
}
