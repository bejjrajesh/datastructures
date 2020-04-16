package linkedlist.singlelinkedlist;

public class Node<T> {

    public Node(T data) {
        this.data = data;
    }

    private Node<T> next;
    private T data;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
