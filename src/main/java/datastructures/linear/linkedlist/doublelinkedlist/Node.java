package datastructures.linear.linkedlist.doublelinkedlist;


//Double LinkedList Node Structure with two pointers.
public class Node<T> {

    //Pointer to Previous Node.
    private Node previous;

    //Pointer to Next Node.
    private Node next;

    //Node Value
    private T data;

    public Node(T data) {
        this.data = data;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

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
