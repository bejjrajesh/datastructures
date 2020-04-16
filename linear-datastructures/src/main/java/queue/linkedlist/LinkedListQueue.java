package queue.linkedlist;

public class LinkedListQueue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void enQueue(T data){
        Node<T> node = new Node<T>(data);
        if( head == null && tail == null){
            head = tail = node;
        }else{
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public T deQueue(){
        if (head ==null){
            System.out.println("Queue is Empty!");
            return null;
        } else if (head == tail) {
            Node<T> temp = head;
            head = tail = null;
            return temp.getData();
        } else{
            Node<T> temp = head;
            head = head.getNext();
            return temp.getData();
        }
    }

    public boolean isQueueEmpty(){
        return head == null;
    }

    public void printQueue(){
        System.out.println("Head of the Queue is : "+ head.getData());
        System.out.println("Tail of the Queue is : "+ tail.getData());
    }
}
