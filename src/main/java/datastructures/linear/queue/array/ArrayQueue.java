package datastructures.linear.queue.array;

public class ArrayQueue {

    private int head = -1;
    private int tail = -1;
    private int[] queue;

    public ArrayQueue(int size) {
        queue = new int[size];
        for(int i=0;i<queue.length;i++){
            queue[i]=-1;
        }
    }

    public void enQueue(int data){
        if(head == -1 && tail == -1){
            queue[++tail] = data;
            head++;
        }else{
            queue[++tail] = data;
        }
    }

    public int deQueue(){
        if(head == -1){
            System.out.println("Queue is Empty!");
            return -1;
        }else{
            int temp = queue[head];
            head++;
            return temp;
        }
    }

    public boolean isEmpty(){
        return head == -1 ;
    }

    public boolean isQueueFull(){
        return tail == queue.length;
    }

    public void printQueue(){
        System.out.println("Head of the Queue is : " + queue[head]);
        System.out.println("Tail of the Queue is : " + queue[tail]);
    }
}

