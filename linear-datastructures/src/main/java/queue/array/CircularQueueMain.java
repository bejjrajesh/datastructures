package queue.array;

public class CircularQueueMain {

    public static void main(String[] args){
        CircularQueue cQueue = new CircularQueue(5);
        System.out.println("Is Queue Empty : "+ cQueue.isQueueEmpty());
        System.out.println("Is Queue Full : "+ cQueue.isQueueFull());
        cQueue.enQueue(100);
        cQueue.peek();
        cQueue.enQueue(200);
        cQueue.peek();
        cQueue.enQueue(300);
        cQueue.peek();
        cQueue.enQueue(400);
        cQueue.peek();
        cQueue.enQueue(500);
        cQueue.peek();
        cQueue.enQueue(600);
        cQueue.peek();
        System.out.println("Removing Element from Queue : " + cQueue.deQueue());
        cQueue.peek();
        cQueue.enQueue(400);
        cQueue.peek();
    }
}
