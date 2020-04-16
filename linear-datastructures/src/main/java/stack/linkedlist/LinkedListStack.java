package stack.linkedlist;

public class LinkedListStack<T> {

    private Node<T> head;
    private int size;

    public void push(T data) {
        Node<T> node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public T pop() {
        if (head == null) {
            return null;
        } else {
            Node<T> temp = head;
            head = head.getNext();
            temp.setNext(null);
            return temp.getData();
        }
    }

    public T peek() {
        if (head != null) {
            return (T) head.getData();
        }
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
