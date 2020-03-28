package datastructures.linear.linkedlist.singlelinkedlist;

public class Node<T> {

    public Node(T data){
        this.data = data;
    }

    private Node next;
    private T data;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
