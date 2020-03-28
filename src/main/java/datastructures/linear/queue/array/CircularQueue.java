package datastructures.linear.queue.array;

public class CircularQueue {

    private int head = -1 ;
    private int tail = -1 ;
    private int[] queue;

    public CircularQueue(int size){
        queue = new int[size];
        for(int i=0;i<queue.length;i++){
            queue[i] = -1;
        }
    }

    public void enQueue(int data){
        if( head ==-1 && tail ==-1){
            ++head;
        } else if( tail == queue.length -1 ){
            tail = -1;
        } else if ( isQueueFull()){
            System.out.println("Queue is Full");
        } else{
            tail = tail+1;
        }
        queue[tail] = data;
    }

    public int deQueue(){
        if( head == queue.length-1){
            head = 0;
        }
        return queue[head++];
    }

    public boolean isQueueEmpty(){
        return head == -1 && tail == -1;
    }

    public boolean isQueueFull(){
        if( tail + 1 == head){
            return true;
        }else if( head ==0  && (tail+1==queue.length)){
            return true;
        }
        return false;
    }

    public void printQueue(){
        System.out.println("Queue Head Index = " + head + " Value = "+queue[head]);
        System.out.println("Queue Tail Index = " + (tail) + " Value = "+queue[tail]);
    }
}
