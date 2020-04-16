package linkedlist.circulardoublelinkedlist;

public class CircularDoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void insertAtBeginning(T data) {
        System.out.println("Inserting Node " + data + " at Beginning");
        Node node = new Node(data);
        if (head == null) {
            node.setNext(node);
            node.setPrevious(node);
            head = tail = node;
        } else {
            node.setNext(head);
            node.setPrevious(tail);
            head.setPrevious(node);
            head = node;
            tail.setNext(head);
        }
        size++;
    }

    public void insertAtEnd(T data) {
        System.out.println("Inserting Node " + data + " at the end");
        Node node = new Node(data);
        if (tail == null) {
            System.out.println("List is Empty!!");
        } else {
            node.setPrevious(tail);
            node.setNext(tail.getNext());
            tail.setNext(node);
            head.setPrevious(node);
            tail = node;
        }
        size++;
    }

    public void insertAtPosition(int position, T data) {
        System.out.println("Inserting Node " + data + " at Position : " + position);
        Node node = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.getNext();
        }
        node.setNext(temp.getNext());
        node.setPrevious(temp);
        temp.getNext().setPrevious(node);
        temp.setNext(node);
        size++;
    }

    public void deleteFromBeginning() {
        System.out.println("Deleting Node from Beginning");
        if (head == null) {
            System.out.println("List is Empty!!");
        } else {
            head.setPrevious(null);
            tail.setNext(head.getNext());
            head.getNext().setPrevious(tail);
            head = head.getNext();
        }
        size--;
    }

    public void deleteFromEnd() {
        System.out.println("Deleting Node from end");
        if (tail == null) {
            System.out.println("List is Empty!!");
        } else {
            head.setNext(tail.getPrevious());
            tail.getPrevious().setNext(head);
            tail.setNext(null);
            tail.setPrevious(null);
        }
        size--;
    }

    public void deleteFromPosition(int position) {
        System.out.println("Deleting Node from position " + position);
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.getNext();
        }
        temp.getNext().getNext().setPrevious(temp);
        temp.setNext(temp.getNext().getNext());
        temp.setPrevious(null);
        size--;
    }

    public void traverseNodes() {
        Node temp = head;
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(" | " + temp.getData() + " | ");
            temp = temp.getNext();
        }
        System.out.println("\n");
    }
}
