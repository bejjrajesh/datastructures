package datastructures.linear.stack.linkedlist;

public class LinkedListStack<T> {

    private Node head;
    private int size;

    public void push(T data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            node.setNext(head);
            head = node;
        }
    }

    public T pop(){
        if(head == null){
            return null;
        }else{
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            return (T)temp.getData();
        }
    }

    public T peek(){
        if(head!=null){
            return (T)head.getData();
        }
        return null;
    }

    public boolean isEmpty(){
        return head==null;
    }
}
