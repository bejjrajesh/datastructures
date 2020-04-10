package datastructures.linear.queue.array;

public class CircularQueue {

    private int head = 0;
    private int tail = 0;
    private int[] queue;

    public CircularQueue(int size) {
        queue = new int[size];
        for (int i = 0; i < queue.length; i++) {
            queue[i] = -1;
        }
    }

    public void enQueue(int data) {
        if (isQueueFull()) {
            System.out.println("Queue is Full");
        } else if (tail == queue.length) {
            tail = 0;
        }
        queue[tail++] = data;
    }

    public int deQueue() {
        if (head == queue.length - 1) {
            head = 0;
        }
        if (isQueueEmpty()) {
            System.out.println("Queue is Empty");
        }
        int temp = queue[++head];
        return temp;
    }

    public boolean isQueueEmpty() {
        return head == -1 && tail == -1;
    }

    public boolean isQueueFull() {
        if (head == tail && tail!=-1 ) {
            return true;
        }else if (head == -1 && tail == queue.length-1){
            return true;
        }
        return false;
    }

    public void peek() {
        if(head == -1 && tail!= -1){
            System.out.println("Current Head Value = " + (head+1) + " Value = " + queue[head+1]);
        }else{
            System.out.println("Current Head Value = " + (head) + " Value = " + queue[head]);
        }
    }
}
