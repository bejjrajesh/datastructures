package datastructures.linear.queue.linkedlist;

public class LinkedListQueueMain {

    public static void main(String argsp[]){

        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        System.out.println("Is Queue Empty: " + queue.isQueueEmpty());
        queue.enQueue(100);
        queue.printQueue();
        queue.enQueue(300);
        queue.printQueue();
        queue.enQueue(250);
        queue.printQueue();
        queue.enQueue(560);
        queue.printQueue();
        queue.enQueue(700);
        queue.printQueue();
        queue.deQueue();
        queue.printQueue();
        queue.deQueue();
        queue.printQueue();
        queue.deQueue();
        queue.printQueue();
    }
}

